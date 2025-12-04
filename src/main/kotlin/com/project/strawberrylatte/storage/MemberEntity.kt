package com.project.strawberrylatte.storage

import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "member")
class MemberEntity(
    val email: String,
    val password: String,
    val name: String,
    val phoneNumber: String,
    val role: Role,
) : BaseEntity()
