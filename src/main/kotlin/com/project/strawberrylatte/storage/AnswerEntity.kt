package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "answer")
class AnswerEntity(
    val questionId: Long,
    val content: String,
) : BaseEntity()
