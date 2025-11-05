package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.web.servlet.function.router

fun booRouter(boo: Boo)= router {
    GET("/boo") {
        ok().body(boo.toString())
    }

}
