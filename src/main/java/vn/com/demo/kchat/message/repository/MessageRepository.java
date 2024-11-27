package vn.com.demo.kchat.message.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.com.demo.kchat.message.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
