package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "order")
class OrderEntity(
    val memberId: Long,
    val totalPrice: Long,
    val address: String,
    val orderType: OrderType,
) : BaseEntity()
