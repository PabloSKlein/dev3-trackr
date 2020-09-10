package dev3.estouropilha.trackr.backend.model

import javax.persistence.Table
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Table(name = "Pessoas")
data class Pessoa(
        val nome: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO) val id: Int = 0
) {
    constructor(): this("")
}