package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "orderDetail")
class OrderDetailEntity(
    val orderId: Long,
    val productOptionId: Long,
    val endPrice: Long,
    val stock: Long,
) : BaseEntity()
