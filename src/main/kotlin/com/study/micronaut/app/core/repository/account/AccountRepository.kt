package com.study.micronaut.app.core.repository.account

import com.study.micronaut.app.core.entities.account.Account
import java.util.UUID

interface AccountRepository {
    fun save(account: Account): Account
    fun findByCpf(cpf: String): Account
    fun findById(id: UUID): Account
    fun updateBank(account: UUID, bankId: UUID?)
}