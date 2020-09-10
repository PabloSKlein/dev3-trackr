package dev3.estouropilha.trackr.backend.dto

import com.fasterxml.jackson.annotation.JsonCreator


data class CriarPessoaDto @JsonCreator constructor(val nome: String)