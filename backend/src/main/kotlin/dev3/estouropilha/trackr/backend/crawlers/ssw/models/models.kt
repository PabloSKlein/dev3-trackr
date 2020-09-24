package dev3.estouropilha.trackr.backend.crawlers.ssw.models

import java.time.LocalDateTime

data class Entrega (val movimentacoes: List<Movimentacao>)

data class Movimentacao(
    val data: LocalDateTime, val unidade: String, val detalhes: String
)