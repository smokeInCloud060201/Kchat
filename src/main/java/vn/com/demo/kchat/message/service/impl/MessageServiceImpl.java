package vn.com.demo.kchat.message.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import vn.com.demo.kchat.common.dto.FileDTO;
import vn.com.demo.kchat.common.entities.File;
import vn.com.demo.kchat.common.mapper.FileMapper;
import vn.com.demo.kchat.message.dto.MessageDTO;
import vn.com.demo.kchat.message.entity.Message;
import vn.com.demo.kchat.message.mapper.MessageMapper;
import vn.com.demo.kchat.message.repository.MessageRepository;
import vn.com.demo.kchat.message.service.MessageService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {
    private final MessageRepository messageRepository;
    private final FileMapper fileMapper;
    private final MessageMapper messageMapper;

    @Override
    public MessageDTO.CreateMessageResponse createMessage(MessageDTO.CreateMessageRequest messageRequest) {

        List<File> files = messageRequest.getFileDTOList()
                .map(s -> s.stream()
                        .map(fileMapper::toFileEntity)
                        .toList())
                .orElse(null);

        Message message = new Message();
        message.setContent(messageRequest.getMessage());
        if (!files.isEmpty()) {
            message.setFileList(files);
        }
        message = messageRepository.save(message);
        return messageMapper.toCreateMessageResponse(message);
    }
}
