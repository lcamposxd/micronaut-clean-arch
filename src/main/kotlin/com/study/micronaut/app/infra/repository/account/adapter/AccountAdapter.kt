package com.study.micronaut.app.infra.repository.account.adapter

import com.study.micronaut.app.core.entities.account.Account
import java.util.UUID


interface AccountAdapter {
    fun save(account: Account): Account
    fun findByCpf(cpf: String): Account
    fun find(id: UUID): Account
    fun update(id: UUID, bankId: UUID?)
}