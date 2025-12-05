package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "store")
class StoreEntity(
    val memberId: Long,
    val storeName: String,
    val description: String,
) : BaseEntity()
