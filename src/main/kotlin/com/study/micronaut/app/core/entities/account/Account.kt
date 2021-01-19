package com.study.micronaut.app.core.entities.account

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Account(
    @Id val id: UUID,
    val name: String,
    val cpf: String,
    var bankId: UUID? = null
)