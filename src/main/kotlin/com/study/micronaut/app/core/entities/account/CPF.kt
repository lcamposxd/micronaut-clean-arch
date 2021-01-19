package com.study.micronaut.app.core.entities.account

class CPF(number: String) {

    val number: String

    val formatted
     get() =
         run {
             with(number) {
                 substring(0, 3) +'.'+substring(3, 6)+'.'+substring(6, 9)+'-'+substring(9, 11)
             }
         }

    init {
        if(number.length < 11) {
            throw IllegalArgumentException("Wrong CPF $number")
        }
        this.number = number.filterNot { it == '.' || it == '-' }
    }

}