package com.study.micronaut.app.entrypoint.bank

import com.study.micronaut.app.core.entities.dtos.AccountBankDto
import com.study.micronaut.app.core.entities.dtos.BankDto
import java.util.UUID

data class AddNewAccountBankRequest (
    val accountId: String,
    val bankId: String
) {
    val toDto
        get() = AccountBankDto(UUID.fromString(accountId), UUID.fromString(bankId))
}