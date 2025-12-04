package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.Table

@Entity
@Table(name = "product")
class ProductEntity (
    val name: String,
    val description: String,
    val imageUrl: String,
    val price: Long,
    @Enumerated(EnumType.STRING)
    val status: ProductStatus
    ) : BaseEntity();