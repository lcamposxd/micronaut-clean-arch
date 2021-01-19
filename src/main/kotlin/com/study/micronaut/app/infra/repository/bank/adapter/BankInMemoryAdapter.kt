package com.study.micronaut.app.infra.repository.bank.adapter

import com.study.micronaut.app.core.entities.bank.Bank
import java.util.UUID
import javax.inject.Singleton

@Singleton
class BankInMemoryAdapter: BankAdapter {

    private val bankList = mutableListOf<Bank>()

    override fun find(id: UUID): Bank {
        return this.bankList.find{ it.id == id}?: throw Exception("ID [$id] not found")
    }

    override fun save(bank: Bank): Bank {
        this.bankList.add(bank)
        return bank
    }


}