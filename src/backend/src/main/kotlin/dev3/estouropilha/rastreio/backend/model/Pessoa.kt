package dev3.estouropilha.rastreio.backend.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Pessoa(
        val nome: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int = -1
) {
    constructor(): this("")
}