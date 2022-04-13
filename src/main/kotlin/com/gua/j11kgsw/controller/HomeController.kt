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

    @GetMapping("/delete")
    fun deleteMessage(id: Int) {
        return service.deleteMessage(id)
    }
}
