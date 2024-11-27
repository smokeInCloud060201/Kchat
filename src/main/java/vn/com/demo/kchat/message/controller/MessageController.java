package vn.com.demo.kchat.message.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.HtmlUtils;
import vn.com.demo.kchat.message.dto.Greeting;
import vn.com.demo.kchat.message.dto.HelloMessage;
import vn.com.demo.kchat.message.dto.MessageDTO;
import vn.com.demo.kchat.message.service.MessageService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public MessageDTO.CreateMessageResponse createMessage(MessageDTO.CreateMessageRequest messageRequest) throws Exception {
        return messageService.createMessage(messageRequest);
    }
}
