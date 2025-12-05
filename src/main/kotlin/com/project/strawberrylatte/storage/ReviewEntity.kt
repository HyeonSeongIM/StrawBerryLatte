package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "review")
class ReviewEntity(
    val orderItemId: Long,
    val star: Long,
    val description: String,
) : BaseEntity()
