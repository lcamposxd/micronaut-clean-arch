package com.study.micronaut.app.core.usecase.account

import com.study.micronaut.app.core.entities.dtos.AccountDto
import com.study.micronaut.app.core.repository.account.AccountRepository
import com.study.micronaut.app.core.usecase.Command
import com.study.micronaut.app.core.entities.account.CPF
import javax.inject.Singleton


@Singleton
class RegisterUserUseCase(private val accountRepository: AccountRepository) : Command<AccountDto, AccountDto> {

    override fun execute(param: AccountDto): AccountDto {
        if(param.name.isBlank()) {
            throw IllegalArgumentException("Invalid name")
        }

        return accountRepository.save(param.toEntity()).let {
            AccountDto(it.id, it.name, CPF(it.cpf), it.bankId)
        }
    }

}