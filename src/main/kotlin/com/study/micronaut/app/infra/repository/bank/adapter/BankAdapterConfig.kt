package com.study.micronaut.app.infra.repository.bank.adapter

import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
class BankAdapterConfig {
    @Singleton
    fun bankAdapter(
        micronautAdapter: BankMicronautAdapter,
        inMemoryAdapter: BankInMemoryAdapter
    ): BankAdapter {
        return inMemoryAdapter
    }
}