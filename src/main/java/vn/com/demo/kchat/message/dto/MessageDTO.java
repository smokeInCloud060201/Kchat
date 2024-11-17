package vn.com.demo.kchat.message.dto;

import lombok.Builder;
import lombok.Data;

public interface MessageDTO {

    @Data
    @Builder
    class GreetingMessage {
        private String message;
    }
}
