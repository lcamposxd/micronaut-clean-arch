package com.study.micronaut.app.infra.repository.account.adapter

import com.study.micronaut.app.core.entities.account.Account
import java.util.UUID
import javax.inject.Singleton

@Singleton
class AccountInMemoryAdapter:AccountAdapter {

    private val accountList = mutableListOf<Account>()

    override fun save(account: Account): Account {
        this.accountList.add(account)
        return account
    }
    override fun findByCpf(cpf: String): Account {
        return this.accountList.find { it.cpf == cpf }?: throw Exception("CPF [$cpf] not found")
    }

    override fun find(id: UUID): Account {
        return this.accountList.find{ it.id == id}?: throw Exception("ID [$id] not found")
    }

    override fun update(account: UUID, bankId: UUID?) {
        this.accountList.find { it.id == account }.apply { this?.bankId = bankId }
    }


}