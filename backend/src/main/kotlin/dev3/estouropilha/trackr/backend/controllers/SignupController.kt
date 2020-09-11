package dev3.estouropilha.trackr.backend.controllers

import dev3.estouropilha.trackr.backend.model.User
import dev3.estouropilha.trackr.backend.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.created
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/signup")
class SignupController {

    @Autowired
    private lateinit var userService: UserService

    @PostMapping
    fun registro(@RequestBody user: User): ResponseEntity<User> {
        val createdUser = userService.create(user)

        return created(URI("")).body(createdUser)
    }
}