package com.gua.j11kgsw.pojo

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("message")
data class Message(@Id val id: String?, val text: String)