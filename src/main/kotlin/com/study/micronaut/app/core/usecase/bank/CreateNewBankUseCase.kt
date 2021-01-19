package com.study.micronaut.app.core.usecase.bank

import com.study.micronaut.app.core.entities.dtos.BankDto
import com.study.micronaut.app.core.repository.bank.BankRepository
import com.study.micronaut.app.core.usecase.Command
import javax.inject.Singleton

@Singleton
class CreateNewBankUseCase(private val bankRepository: BankRepository): Command<BankDto, BankDto> {
    override fun execute(param: BankDto): BankDto {
        if(param.name.isBlank()) {
            throw IllegalArgumentException("Invalid name")
        }

        return bankRepository.save(param.toEntity()).let { BankDto(it.id, it.name) }
    }
}