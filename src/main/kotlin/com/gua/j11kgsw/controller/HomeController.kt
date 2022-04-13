package com.gua.j11kgsw.controller

import com.gua.j11kgsw.pojo.Message
import com.gua.j11kgsw.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

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
}
