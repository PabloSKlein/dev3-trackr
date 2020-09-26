package dev3.estouropilha.trackr.backend.controllers

import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PingController {
    @GetMapping("/ping")
    fun ping(): ResponseEntity<String> {
        return ok("Pong")
    }
}