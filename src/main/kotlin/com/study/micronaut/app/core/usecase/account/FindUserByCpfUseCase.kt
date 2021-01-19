package com.study.micronaut.app.core.usecase.account

import com.study.micronaut.app.core.entities.dtos.AccountDto
import com.study.micronaut.app.core.entities.account.CPF
import com.study.micronaut.app.core.repository.account.AccountRepository
import com.study.micronaut.app.core.usecase.Command
import javax.inject.Singleton


@Singleton
class FindUserByCpfUseCase(private val accountRepository: AccountRepository) : Command<AccountDto, CPF> {

    override fun execute(param: CPF): AccountDto {
        return accountRepository.findByCpf(param.number).let {
            AccountDto(it.id, it.name, CPF(it.cpf), it.bankId)
        }
    }
    
}