package com.study.micronaut.app.infra.repository.bank

import com.study.micronaut.app.core.entities.bank.Bank
import com.study.micronaut.app.core.repository.bank.BankRepository
import com.study.micronaut.app.infra.repository.bank.adapter.BankAdapter
import java.util.UUID
import javax.inject.Singleton

@Singleton
class BankRepositoryImpl(
    private val repositoryAdapter: BankAdapter
): BankRepository {
    override fun save(bank: Bank): Bank {
        return repositoryAdapter.save(bank)
    }
}