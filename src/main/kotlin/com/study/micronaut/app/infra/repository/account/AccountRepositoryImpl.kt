package com.study.micronaut.app.infra.repository.account

import com.study.micronaut.app.core.entities.account.Account
import com.study.micronaut.app.core.repository.account.AccountRepository
import com.study.micronaut.app.infra.repository.account.adapter.AccountAdapter
import java.util.UUID
import javax.inject.Singleton

@Singleton
class AccountRepositoryImpl(
    private val repositoryAdapter: AccountAdapter
): AccountRepository {
    override fun save(account: Account): Account {
        return repositoryAdapter.save(account)
    }

    override fun findByCpf(cpf: String): Account {
       return repositoryAdapter.findByCpf(cpf)
    }

    override fun findById(id: UUID): Account {
        return repositoryAdapter.find(id)
    }

    override fun updateBank(account: UUID, bankId: UUID?) {
        return repositoryAdapter.update(account, bankId)
    }
}