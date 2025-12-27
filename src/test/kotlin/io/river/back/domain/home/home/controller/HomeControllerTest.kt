package io.river.back.domain.home.home.controller

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultHandlers
import org.springframework.test.web.servlet.result.MockMvcResultMatchers

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureMockMvc
class HomeControllerTest {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    @DisplayName("메인")
    fun t1() {
        val resultActions = mvc
            .perform(
                MockMvcRequestBuilders.get("/")
            )
            .andDo(MockMvcResultHandlers.print())

        resultActions
            .andExpect(MockMvcResultMatchers.handler().handlerType(HomeController::class.java))
            .andExpect(MockMvcResultMatchers.handler().methodName("main"))
            .andExpect(MockMvcResultMatchers.status().isOk)
    }
}
