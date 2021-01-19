package com.study.micronaut.app.infra.repository.bank.adapter

import com.study.micronaut.app.core.entities.bank.Bank
import com.study.micronaut.app.infra.repository.account.adapter.AccountAdapter
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import java.util.UUID

@Repository
interface BankMicronautAdapter: CrudRepository<Bank, UUID>, BankAdapter