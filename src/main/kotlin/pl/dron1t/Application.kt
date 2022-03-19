package pl.dron1t

import io.micronaut.runtime.Micronaut.*
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.info.*

@OpenAPIDefinition(
        info = Info(
                title = "weirder",
                version = "0.1"
        )
)
object Api {
}

fun main(args: Array<String>) {
    build()
            .args(*args)
            .packages("pl.dron1t")
            .start()
}

