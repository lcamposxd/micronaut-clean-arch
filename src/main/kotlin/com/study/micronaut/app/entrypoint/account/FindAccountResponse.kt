package com.study.micronaut.app.entrypoint.account

import java.util.UUID

data class FindAccountResponse(
    val id: String,
    val name: String,
    val cpf: String,
    val bankId: UUID?
)