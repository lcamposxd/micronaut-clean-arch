package com.study.micronaut.app.entrypoint.bank

import com.study.micronaut.app.core.usecase.bank.AddNewAccountUseCase
import com.study.micronaut.app.core.usecase.bank.CreateNewBankUseCase
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put


@Controller("/bank")
class BankController (
    private val createNewBankUseCase: CreateNewBankUseCase,
    private val addNewAccountUseCase: AddNewAccountUseCase
) {

    @Post
    fun save(@Body request: CreateBankRequest): HttpResponse<CreateBankResponse> {
        return createNewBankUseCase.execute(request.toDto).let {
            HttpResponse.ok( CreateBankResponse(it.id.toString() , it.name) )
        }
    }

    @Put("/add")
    fun addNewAccount(@Body request: AddNewAccountBankRequest): HttpResponse<Any> {
        return addNewAccountUseCase.execute(request.toDto).let {
            HttpResponse.noContent()
        }
    }


}