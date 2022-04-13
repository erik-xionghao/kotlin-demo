package com.gua.j11kgsw.dao

import com.gua.j11kgsw.pojo.Message
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, Int> {
    @Query("select * from message")
    fun findMessage(): List<Message>
}