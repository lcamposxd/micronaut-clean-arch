package com.study.micronaut.app.core.entities.bank

import java.util.UUID
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Bank(
    @Id val id: UUID,
    val name: String
)