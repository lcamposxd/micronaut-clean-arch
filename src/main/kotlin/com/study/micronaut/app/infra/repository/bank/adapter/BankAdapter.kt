package com.study.micronaut.app.infra.repository.bank.adapter

import com.study.micronaut.app.core.entities.bank.Bank
import java.util.UUID


interface BankAdapter {
    fun find(id: UUID): Bank
    fun save(bank: Bank): Bank
}