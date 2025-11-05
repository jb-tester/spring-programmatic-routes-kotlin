package com.mytests.spring.springprogrammaticrouteskotlin

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
class SpringProgrammaticRoutesKotlinApplicationTests(@Autowired private val foo: Foo,
                                                     @Autowired private val boo: Boo,
                                                     @Autowired private val mockMvc: MockMvc) {

    @Test
    fun beansTest() {
        assertNotNull(foo)
        assertNotNull(boo)
    }

    @Test
    fun newRouteTest() {
        mockMvc.get("/new/test/{id}", 1).andExpect {status { isOk() }
            content { string("get new test with id = 1")}
    }}

    @Test
    fun fooRouteTest() {
        mockMvc.get("/foo").andExpect {status { isOk() }
            content { string("foo!")}
        }}
    @Test
    fun booRouteTest() {
        mockMvc.get("/boo").andExpect {status { isOk() }
            content { string("boo!")}
        }}
}
