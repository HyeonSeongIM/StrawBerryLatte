package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "question")
class QuestionEntity(
    val memberId: Long,
    val productId: Long,
    val title: String,
    val content: String,
    val isPublic: Boolean,
) : BaseEntity()
