package com.study.micronaut.app.core.usecase.bank

import com.study.micronaut.app.core.entities.dtos.AccountBankDto
import com.study.micronaut.app.core.repository.account.AccountRepository
import com.study.micronaut.app.core.usecase.Command
import javax.inject.Singleton

@Singleton
class AddNewAccountUseCase(
    private val repository: AccountRepository
) : Command<Unit, AccountBankDto> {
    override fun execute(param: AccountBankDto) {
        val account =
            repository.findById(param.accountId)
                .copy(bankId = param.bankId)
        repository.updateBank(account.id, account.bankId)
    }

}