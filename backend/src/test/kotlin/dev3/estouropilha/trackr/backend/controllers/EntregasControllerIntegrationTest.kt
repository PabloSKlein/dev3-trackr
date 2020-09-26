package dev3.estouropilha.trackr.backend.controllers

import dev3.estouropilha.trackr.backend.helpers.BaseIntegrationTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

internal class EntregasControllerIntegrationTest : BaseIntegrationTest() {

    @BeforeEach
    fun setUp() {

    }

    @Test
    fun `Informar CPF inválido deve retornar BadRequest`() {
        getMockMvc()
                .perform(get("/entregas/{cpf}", "123456789"))
                .andExpect(status().isBadRequest)
    }

    @Test
    fun `Informar CPF válido deve retornar entregas existentes`(cpf: String) {
        getMockMvc()
                .perform(get("/entregas/{cpf}", "12345678999"))
                .andExpect(status().isOk)
    }
}