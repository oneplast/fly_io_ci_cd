package io.river.back

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FlyCiCdApplication

fun main(args: Array<String>) {
    runApplication<FlyCiCdApplication>(*args)
}
