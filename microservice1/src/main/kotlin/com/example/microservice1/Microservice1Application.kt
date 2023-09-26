package com.example.microservice1

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class Microservice1Application

fun main(args: Array<String>) {
    runApplication<Microservice1Application>(*args)
}
