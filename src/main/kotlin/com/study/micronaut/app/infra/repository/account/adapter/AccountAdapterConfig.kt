package com.study.micronaut.app.infra.repository.account.adapter

import io.micronaut.context.annotation.Factory
import javax.inject.Singleton

@Factory
class AccountAdapterConfig {
    @Singleton
    fun bankAdapter(
        micronautAdapter: AccountMicronautAdapter,
        inMemoryAdapter: AccountInMemoryAdapter
    ): AccountAdapter {
        return inMemoryAdapter
    }
}