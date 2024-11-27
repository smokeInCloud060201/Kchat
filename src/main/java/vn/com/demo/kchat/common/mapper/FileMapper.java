package vn.com.demo.kchat.common.mapper;

import org.springframework.stereotype.Component;
import vn.com.demo.kchat.common.dto.FileDTO;
import vn.com.demo.kchat.common.entities.File;


@Component
public class FileMapper {

    public File toFileEntity(FileDTO fileDTO) {
        if (fileDTO == null) {
            return null;
        }

        File file = new File();

        file.setBase64(file.getBase64());

        return file;
    }

    public FileDTO toFileDTO(File file) {
        if (file == null) {
            return null;
        }

        return FileDTO.builder()
                .id(file.getId().toString())
                .build();
    }
}
