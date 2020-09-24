package dev3.estouropilha.trackr.backend.controllers

import dev3.estouropilha.trackr.backend.crawlers.ssw.SswCrawler
import dev3.estouropilha.trackr.backend.dto.EntregaDto
import dev3.estouropilha.trackr.backend.dto.MovimentacaoDto
import io.swagger.annotations.Api
import io.swagger.annotations.ApiParam
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException
import javax.validation.constraints.Pattern

@Api("Entregas")
@RestController
@RequestMapping("/entregas")
@Validated
class EntregasController {

    private val sswCrawler = SswCrawler()

    @GetMapping("/{cpf}")
    fun consultarPorCpf(@PathVariable("cpf")
                        @Pattern(regexp = "^\\d{11}$")
                        @ApiParam(value = "CPF sem máscara", example = "01278946500")
                        cpf: String) : ResponseEntity<List<EntregaDto>> {

        // Todo: Tentar fazer a validação usando a anotação @Pattern
        if(!Regex("^\\d{11}$").matches(cpf)) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF inválido")
        }

        val entregas = sswCrawler.consultarEntregas(cpf)
                .map {
                    EntregaDto(
                            it.movimentacoes.map { m -> MovimentacaoDto(m.data, m.detalhes, m.unidade) }
                    )
                }

        return ok(entregas)
    }
}