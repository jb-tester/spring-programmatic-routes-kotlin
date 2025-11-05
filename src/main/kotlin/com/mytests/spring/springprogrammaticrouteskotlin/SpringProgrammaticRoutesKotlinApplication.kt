package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@SpringBootApplication
@Import(MyBeansRegistrar::class)
class SpringProgrammaticRoutesKotlinApplication

fun main(args: Array<String>) {
    runApplication<SpringProgrammaticRoutesKotlinApplication>(*args)
}
