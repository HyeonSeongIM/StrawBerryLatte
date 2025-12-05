package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "coupon")
class CouponEntity(
    val title: String,
    val couponType: CouponType,
    val discountValue: Long,
    val expiredDate: LocalDateTime,
) : BaseEntity()
