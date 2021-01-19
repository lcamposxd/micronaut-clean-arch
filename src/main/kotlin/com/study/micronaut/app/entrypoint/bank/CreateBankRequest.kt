package com.study.micronaut.app.entrypoint.bank

import com.study.micronaut.app.core.entities.dtos.BankDto
import java.util.UUID

data class CreateBankRequest (
    val name: String
) {
    val toDto
        get() = BankDto(
            id = UUID.randomUUID(),
            name = name
        )
}