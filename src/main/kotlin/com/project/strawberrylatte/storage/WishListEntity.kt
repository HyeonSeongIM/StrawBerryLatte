package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "wishList")
class WishListEntity(
    val memberId: Long,
    val productId: Long,
) : BaseEntity()
