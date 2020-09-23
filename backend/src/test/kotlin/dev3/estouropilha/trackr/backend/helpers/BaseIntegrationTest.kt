package dev3.estouropilha.trackr.backend.helpers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext

@ActiveProfiles("test")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class BaseIntegrationTest {
    @Autowired
    private lateinit var mvc: MockMvc;

    @Autowired
    private lateinit var contexto: WebApplicationContext;

    protected fun getMockMvc(): MockMvc
        = MockMvcBuilders.webAppContextSetup(contexto).build()

}