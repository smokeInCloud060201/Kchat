package vn.com.demo.kchat.message.service;

import vn.com.demo.kchat.message.dto.MessageDTO;

public interface MessageService {
    MessageDTO.CreateMessageResponse createMessage(MessageDTO.CreateMessageRequest messageRequest);

}
