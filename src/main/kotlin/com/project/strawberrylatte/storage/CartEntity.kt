package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "cart")
class CartEntity(
    val memberId: Long,
    val productOptionId: Long,
    val stock: String,
) : BaseEntity()
