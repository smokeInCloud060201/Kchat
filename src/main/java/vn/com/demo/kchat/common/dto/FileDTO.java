package vn.com.demo.kchat.common.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Getter;
import vn.com.demo.kchat.common.enums.FileType;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Builder
public class FileDTO {
    private String id;
    private String base64;
    private FileType fileType;
}
