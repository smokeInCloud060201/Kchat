package vn.com.demo.kchat.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import vn.com.demo.kchat.common.enums.FileType;


@Table(name = "files")
@Entity
@Getter
@Setter

public class File extends BaseEntity {

    @Column(name = "file_content")
    private String base64;

    @Column(name = "file_type")
    @Enumerated(EnumType.STRING)
    private FileType fileType;
}
