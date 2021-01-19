package com.study.micronaut.app.core.repository.bank

import com.study.micronaut.app.core.entities.bank.Bank

interface BankRepository {
    fun save(bank: Bank): Bank
}