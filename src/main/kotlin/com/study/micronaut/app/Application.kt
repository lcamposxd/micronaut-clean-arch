package com.study.micronaut.app

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.study.micronaut.app")
		.start()
}

