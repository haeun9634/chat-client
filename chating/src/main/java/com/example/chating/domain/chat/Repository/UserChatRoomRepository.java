package com.example.domain.chat.Repository;

import com.example.domain.chat.UserChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserChatRoomRepository extends JpaRepository<UserChatRoom, Long> {
    List<UserChatRoom> findByChatRoomId(Long chatRoomId);
}
