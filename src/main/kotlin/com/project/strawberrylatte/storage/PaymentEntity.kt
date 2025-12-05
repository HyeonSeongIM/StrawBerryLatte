package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "payment")
class PaymentEntity(
    val orderId: Long,
    val key: Long,
    val helper: Long,
    val price: Long,
) : BaseEntity()
