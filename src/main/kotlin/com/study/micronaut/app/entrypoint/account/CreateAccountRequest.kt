package com.study.micronaut.app.entrypoint.account

import com.study.micronaut.app.core.entities.dtos.AccountDto
import com.study.micronaut.app.core.entities.account.CPF
import java.util.UUID

data class CreateAccountRequest (
    val name: String,
    val cpf: String
) {
    val toDto
        get() = AccountDto(
            id = UUID.randomUUID(),
            cpf = CPF(cpf),
            name = name
        )
}