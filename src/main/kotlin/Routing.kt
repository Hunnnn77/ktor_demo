package com.example

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

@Serializable
data class User(val name: String)

fun Application.configureRouting() {
    routing {
        post("/") {
            val user = call.receive<User>()
            val user2 = call.receive<User>()
        }

        get("/") {
            val user = User(
                name = "hello owlrd"
            )
            val (name) = user
            call.respondText("Hello World!")
        }
    }
}
