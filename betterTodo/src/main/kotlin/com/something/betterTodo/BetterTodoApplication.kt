package com.something.betterTodo

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BetterTodoApplication

fun main(args: Array<String>) {
	runApplication<BetterTodoApplication>(*args)
}


