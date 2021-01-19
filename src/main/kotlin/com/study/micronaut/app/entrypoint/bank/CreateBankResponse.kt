package com.study.micronaut.app.entrypoint.bank

import java.util.UUID

data class CreateBankResponse (
    val id: String,
    val name: String
)