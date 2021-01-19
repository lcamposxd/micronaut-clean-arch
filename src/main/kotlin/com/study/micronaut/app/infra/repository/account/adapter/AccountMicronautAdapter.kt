package com.study.micronaut.app.infra.repository.account.adapter

import com.study.micronaut.app.core.entities.account.Account
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.UUID

@Repository
interface AccountMicronautAdapter: CrudRepository<Account, UUID>, AccountAdapter {
    override fun findByCpf(cpf: String): Account
    override fun update(@Id id: UUID, bankId: UUID?)
}