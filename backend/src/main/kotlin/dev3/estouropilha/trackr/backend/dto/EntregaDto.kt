package dev3.estouropilha.trackr.backend.dto

import java.time.LocalDate
import java.time.LocalDateTime

data class EntregaDto (
    val movimentacoes: Iterable<MovimentacaoDto>
)

data class MovimentacaoDto (
    val dataHora: LocalDateTime,
    val local: String,
    val situacao: String
)

data class SituacaoDto (
    val titulo: String,
    val descricao: String = ""
)