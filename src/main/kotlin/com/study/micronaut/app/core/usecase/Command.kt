package com.study.micronaut.app.core.usecase

interface Command<request,response> {
    fun execute(param: response): request
}