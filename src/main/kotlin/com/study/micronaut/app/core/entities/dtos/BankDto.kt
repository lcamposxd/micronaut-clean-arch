package com.study.micronaut.app.core.entities.dtos

import com.study.micronaut.app.core.entities.bank.Bank
import java.util.UUID


data class BankDto(
    val id: UUID,
    val name: String
) {

    fun toEntity() = Bank(id, name)
}