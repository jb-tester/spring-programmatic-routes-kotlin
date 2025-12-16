package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.web.servlet.function.router

class FooRouter {

    companion object {
    fun fooRouter(foo: Foo) = router {
        GET("/foo") {
            ok().body(foo.toString())
        }
    }}
}
