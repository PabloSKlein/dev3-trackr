package dev3.estouropilha.trackr.backend.controllers

import dev3.estouropilha.trackr.backend.dto.CriarPessoaDto
import dev3.estouropilha.trackr.backend.dto.PessoaDto
import dev3.estouropilha.trackr.backend.model.Pessoa
import dev3.estouropilha.trackr.backend.repo.PessoaRepository
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/pessoas")
class PessoasController(private val repository: PessoaRepository) {
    @GetMapping
    fun obterTodas(): Iterable<PessoaDto> =
        repository.findAll().map {
            PessoaDto(it.id, it.nome)
        }

    @GetMapping("/inserir-varias")
    fun inserirVarias(): ResponseEntity<Iterable<PessoaDto>> {
        val pessoasCriadas = repository.saveAll(mutableListOf(
            Pessoa("Finn"),
            Pessoa("Jake"),
            Pessoa("Marceline")
        )).map { PessoaDto(it.id, it.nome) }

        return ok(pessoasCriadas)
    }

    @PostMapping
    fun criarNova(@RequestBody pessoa: CriarPessoaDto): PessoaDto {
        val model = repository.save(Pessoa(pessoa.nome))
        return PessoaDto(model.id, model.nome)
    }
}