package com.study.micronaut.app.core.entities.dtos

import com.study.micronaut.app.core.entities.account.Account
import com.study.micronaut.app.core.entities.account.CPF
import java.util.UUID


data class AccountDto(
    val id: UUID,
    val name: String,
    val cpf: CPF,
    val bankId: UUID? = null
) {

    fun toEntity() = Account(id, name, cpf.number, bankId)
}