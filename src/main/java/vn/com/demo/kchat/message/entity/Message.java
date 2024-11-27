package vn.com.demo.kchat.message.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import vn.com.demo.kchat.common.entities.BaseEntity;
import vn.com.demo.kchat.common.entities.File;

import java.util.List;

@Table
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Message extends BaseEntity {
    @Column(name = "content")
    private String content;

    @OneToMany
    @JoinColumn(name = "file_id")
    private List<File> fileList;
}
