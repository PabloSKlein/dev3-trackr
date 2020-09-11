package dev3.estouropilha.trackr.backend.services

import dev3.estouropilha.trackr.backend.model.User
import dev3.estouropilha.trackr.backend.model.UserDetailsImpl
import dev3.estouropilha.trackr.backend.repo.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    private val bCryptPasswordEncoder = BCryptPasswordEncoder()

    fun create(user: User): User {
        user.password = bCryptPasswordEncoder.encode(user.password)
        return userRepository.save(user)
    }

    fun myself(): String? {
        return userRepository.findByEmail(getCurrentUserEmail())?.fullName
    }

    private fun getCurrentUserEmail(): String? {
        val user = SecurityContextHolder.getContext().authentication.principal as UserDetailsImpl
        return user.username
    }

}