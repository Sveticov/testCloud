package com.svetikov

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("First entered")
        }
        get("/show/list") {
            val product: Product = Product(
                "1qw34rds",
                "Tomato",
                12.4f,
                "Fresh tomato")
            call.respond(product)
        }
    }
}
