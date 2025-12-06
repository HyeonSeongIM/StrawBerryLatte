package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "productOption")
class ProductOptionEntity(
    val productId: Long,
    val option: String,
    val stock: Long,
) : BaseEntity()
