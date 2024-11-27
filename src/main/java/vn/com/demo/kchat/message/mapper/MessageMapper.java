package vn.com.demo.kchat.message.mapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import vn.com.demo.kchat.common.mapper.FileMapper;
import vn.com.demo.kchat.message.dto.MessageDTO;
import vn.com.demo.kchat.message.entity.Message;

@Component
@RequiredArgsConstructor
public class MessageMapper {

    private final FileMapper fileMapper;

    public MessageDTO.CreateMessageResponse toCreateMessageResponse(Message message) {
        return MessageDTO.CreateMessageResponse.builder()
                .message(message.getContent())
                .fileDTOList(message.getFileList().stream().map(fileMapper::toFileDTO).toList())
                .build();
    }
}
