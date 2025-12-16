package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.stereotype.Component
import org.springframework.web.servlet.function.ServerRequest
import org.springframework.web.servlet.function.ServerResponse


class NewRouterHandler {

    fun testPathVar(request: ServerRequest): ServerResponse {
        val pathvar = request.pathVariable("pv")
            return ServerResponse.ok().body("specified pathvar = $pathvar")
    }
}
