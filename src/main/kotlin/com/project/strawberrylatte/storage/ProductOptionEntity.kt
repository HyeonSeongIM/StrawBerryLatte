package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "option")
class ProductOptionEntity(
    val productId: Long,
    val option: String,
    val extraFee: Long,
) : BaseEntity()
