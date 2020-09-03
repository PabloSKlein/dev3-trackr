package dev3.estouropilha.rastreio.backend.controllers

import dev3.estouropilha.rastreio.backend.model.Pessoa
import dev3.estouropilha.rastreio.backend.repo.PessoaRepository
import org.jetbrains.annotations.NotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/testes")
class TesteController {

    @Autowired
    lateinit var repository: PessoaRepository

    @RequestMapping("/salvar")
    fun save(): String {
        repository.save(Pessoa("Jack"))
        repository.save(Pessoa("Adam"))
        repository.save(Pessoa("Kim"))
        repository.save(Pessoa("David"))
        repository.save(Pessoa("Peter"))

        return "Done"
    }

    @GetMapping("/ping")
    fun ping(): ResponseEntity<String> {
        return ok("Pong")
    }

//    @GetMapping("pessoa/{nome}")
//    fun getPessoa(@PathVariable @NotNull nome: String) : ResponseEntity<Pessoa> {
//        return ok(Pessoa(nome, 12))
//    }
}