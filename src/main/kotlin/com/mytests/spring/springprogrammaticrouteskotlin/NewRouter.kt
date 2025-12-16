package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.web.servlet.function.ServerResponse
import org.springframework.web.servlet.function.router

fun newRouter(newRouterHandler: NewRouterHandler) =
    router {
        GET("/new/test/{id}") { ServerResponse.ok().body("get new test with id = ${it.pathVariable("id")}") }
        GET("/new/test/handler/{pv}", newRouterHandler::testPathVar)
        POST("/new/test") { ServerResponse.ok().body("post new test") }
    }

