package dev3.estouropilha.trackr.backend.controllers

import dev3.estouropilha.trackr.backend.model.Pessoa
import dev3.estouropilha.trackr.backend.repo.PessoaRepository
import org.springframework.beans.factory.annotation.Autowired
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