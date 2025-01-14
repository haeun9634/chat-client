package com.example.domain.chat.Service;

import com.example.domain.User;
import com.example.domain.chat.ChatRoom;
import com.example.domain.chat.Message;
import com.example.domain.chat.Repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MessageService {
    private final MessageRepository messageRepository;

    public void saveMessage(Long chatRoomId, Long senderId, String content) {
        Message message = Message.builder()
                .chatRoom(ChatRoom.builder().id(chatRoomId).build())
                .sender(User.builder().id(senderId).build())
                .content(content)
                .build();
        messageRepository.save(message);
    }

    public List<Message> getMessagesByChatRoom(Long chatRoomId) {
        return messageRepository.findByChatRoomId(chatRoomId);
    }
}
