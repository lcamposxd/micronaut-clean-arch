package com.study.micronaut.app.core.entities.dtos

import java.util.UUID


data class AccountBankDto(
    val accountId: UUID,
    val bankId: UUID
) 