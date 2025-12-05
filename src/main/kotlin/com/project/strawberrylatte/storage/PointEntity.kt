package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "point")
class PointEntity(
    val memberId: Long,
    val orderId: Long,
    val amount: Long,
    val type: PointType,
    val expiredAt: LocalDateTime,
) : BaseEntity()
