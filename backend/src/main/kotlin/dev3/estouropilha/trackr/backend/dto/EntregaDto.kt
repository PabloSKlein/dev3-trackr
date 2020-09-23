package dev3.estouropilha.trackr.backend.dto

import java.time.LocalDate
import java.time.LocalDateTime

data class EntregaDto (
    val descricao: String,
    val previsaoEntrega: LocalDate,
    val remetente: String,
    val destinatario: String,
    val nomeTransportadora: String,
    val movimentacoes: Iterable<MovimentacoesEntregaDto>
)

data class MovimentacoesEntregaDto (
    val dataHora: LocalDateTime,
    val local: String,
    val situacao: SituacaoDto
)

data class SituacaoDto (
    val titulo: String,
    val descricao: String = ""
)