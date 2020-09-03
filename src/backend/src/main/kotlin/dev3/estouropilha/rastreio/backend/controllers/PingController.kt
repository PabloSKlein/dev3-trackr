package dev3.estouropilha.rastreio.backend.controllers

import dev3.estouropilha.rastreio.backend.dto.Pessoa
import org.jetbrains.annotations.NotNull
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")

class TesteController {

    @GetMapping("/ping")
    fun ping(): ResponseEntity<String> {
        return ok("Pong")
    }

    @GetMapping("pessoa/{nome}")
    fun getPessoa(@PathVariable @NotNull nome: String) : ResponseEntity<Pessoa> {
        return ok(Pessoa(nome, 12))
    }
}