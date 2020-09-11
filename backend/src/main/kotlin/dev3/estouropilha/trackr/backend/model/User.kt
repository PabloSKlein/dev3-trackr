package dev3.estouropilha.trackr.backend.model

import javax.persistence.*

@Entity
@Table(name = "usuarios")
data class User(
        @Id
        @GeneratedValue
        val id: Int = 0,
        val fullName: String = "",
        val email: String = "",
        var password: String = ""
)