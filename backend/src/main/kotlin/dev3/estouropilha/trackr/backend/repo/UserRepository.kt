package dev3.estouropilha.trackr.backend.repo

import dev3.estouropilha.trackr.backend.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User, Int> {
    fun findByEmail(email: String?): User?
}