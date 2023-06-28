package com.innoq.component_challenge.thymeleaf_comptus

import com.innoq.comptus.core.ComptusDialect
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ThymeleafComptusApplication {

    @Bean
    fun comptusDialect(): ComptusDialect = ComptusDialect("com.innoq.component_challenge.thymeleaf_comptus.components")
}

fun main(args: Array<String>) {
    runApplication<ThymeleafComptusApplication>(*args)
}
