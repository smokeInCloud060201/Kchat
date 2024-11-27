package vn.com.demo.kchat.message.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import vn.com.demo.kchat.common.dto.FileDTO;

import java.util.List;
import java.util.Optional;

public interface MessageDTO {

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Data
    @Setter(AccessLevel.NONE)
    class CreateMessageRequest {
        private String message;
        private Optional<List<FileDTO>> fileDTOList;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    @Builder
    @Getter
    @Setter(AccessLevel.NONE)
    class CreateMessageResponse{
        private String id;
        private String message;
        private List<FileDTO> fileDTOList;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private String createdAt;

        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private String updatedAt;
    }
}
