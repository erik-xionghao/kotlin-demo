package com.gua.j11kgsw.service

import com.gua.j11kgsw.dao.MessageRepository
import com.gua.j11kgsw.pojo.Message
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessage(): List<Message> {
        return db.findMessage()
    }

    fun addMessage(message: Message) {
        db.save(message)
    }

    fun deleteMessage(id: Int) {
        db.deleteById(id)
    }
}