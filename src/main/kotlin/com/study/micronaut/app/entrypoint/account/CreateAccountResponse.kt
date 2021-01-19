package com.study.micronaut.app.entrypoint.account

data class CreateAccountResponse (
    val id: String,
    val name: String,
    val cpf: String
)