package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "memberCoupon")
class MemberCoupon(
    val memberId: Long,
    val couponId: Long,
    val checkUsed: Boolean,
    val usedDate: LocalDateTime,
) : BaseEntity()
