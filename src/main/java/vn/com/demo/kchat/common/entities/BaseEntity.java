package vn.com.demo.kchat.common.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Setter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = false)
public class BaseEntity extends AbstractPersistable<Long> implements Serializable {

    @Column(name = "created_at")
    @Setter(AccessLevel.NONE)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    @Setter(AccessLevel.NONE)
    private LocalDateTime updatedAt;

    @Column(name = "is_deleted")
    @Setter
    private Boolean isDeleted;
}