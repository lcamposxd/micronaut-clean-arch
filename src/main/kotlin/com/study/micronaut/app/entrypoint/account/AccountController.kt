package com.study.micronaut.app.entrypoint.account


import com.study.micronaut.app.core.usecase.account.FindUserByCpfUseCase
import com.study.micronaut.app.core.usecase.account.RegisterUserUseCase
import com.study.micronaut.app.core.entities.account.CPF
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post


@Controller("/account")
class AccountController(
    private val registerUserUseCase: RegisterUserUseCase,
    private val findUserByCpfUseCase: FindUserByCpfUseCase
) {

    @Get("/cpf/{cpf}")
    fun  getByCpf(@PathVariable("cpf") cpf: String): HttpResponse<FindAccountResponse> {
        return findUserByCpfUseCase.execute(CPF(cpf)).let {
            HttpResponse.ok( FindAccountResponse(it.id.toString() , it.name, it.cpf.formatted, it.bankId) )
        }
    }

    @Post
    fun save(@Body request: CreateAccountRequest): HttpResponse<CreateAccountResponse> {
        return registerUserUseCase.execute(request.toDto).let {
            HttpResponse.ok( CreateAccountResponse(it.id.toString() , it.name, it.cpf.formatted) )
        }
    }
}