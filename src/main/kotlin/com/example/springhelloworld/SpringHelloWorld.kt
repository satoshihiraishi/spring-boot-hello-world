package com.example.springhelloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SpringHelloWorldApplication

fun main(args: Array<String>) {
    runApplication<SpringHelloWorldApplication>(*args)
}

@RestController
class HelloController {
    @GetMapping("/")
    fun hello() = "Hello World!"
}
