package com.gua.j11kgsw.controller

import com.gua.j11kgsw.pojo.Message
import com.gua.j11kgsw.service.MessageService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/message")
class MessageController(val service: MessageService) {
    @GetMapping("/get")
    fun getMessage(): List<Message> {
        return service.findMessage()
    }

    @PostMapping("/add")
    fun addMessage(@RequestBody message: Message) {
        return service.addMessage(message)
    }

    @PostMapping("/update")
    fun updateMessage(@RequestBody message: Message) {
        return service.addMessage(message)
    }

    @PostMapping("/delete")
    fun deleteMessage(@RequestBody message: Message) {
        if (message.id == null) {
            throw Exception("id can not is null")
        }
        return service.deleteMessage(message)
    }
}
