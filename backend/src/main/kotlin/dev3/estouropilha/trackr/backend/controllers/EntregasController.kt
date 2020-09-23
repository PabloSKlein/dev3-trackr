package dev3.estouropilha.trackr.backend.controllers

import dev3.estouropilha.trackr.backend.dto.EntregaDto
import dev3.estouropilha.trackr.backend.dto.MovimentacoesEntregaDto
import dev3.estouropilha.trackr.backend.dto.SituacaoDto
import io.swagger.annotations.Api
import io.swagger.annotations.ApiParam
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.badRequest
import org.springframework.http.ResponseEntity.ok
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.server.ResponseStatusException
import java.time.LocalDate
import java.time.LocalDateTime
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

@Api("Entregas")
@RestController
@RequestMapping("/entregas")
@Validated
class EntregasController {
    @GetMapping("/{cpf}")
    fun consultarPorCpf(@PathVariable("cpf")
                        @Pattern(regexp = "^\\d{11}$")
                        @ApiParam(value = "CPF sem máscara", example = "01278946500")
                        cpf: String) : ResponseEntity<List<EntregaDto>> {

        // Todo: Tentar fazer a validação usando a anotação @Pattern
        if(!Regex("^\\d{11}$").matches(cpf)) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "CPF inválido")
        }

        val entregas = listOf(
            EntregaDto("Qualquer coisa", LocalDate.now(), "Joaquim", "Jéferson", "Correios",
                listOf(MovimentacoesEntregaDto(LocalDateTime.now(), "Teste", SituacaoDto("Qualquer coisa", "Outra coisa"))))
        )

        return ok(entregas)
    }
}