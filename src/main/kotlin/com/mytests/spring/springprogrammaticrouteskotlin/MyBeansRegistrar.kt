package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.beans.factory.BeanRegistrarDsl

class MyBeansRegistrar : BeanRegistrarDsl({
    registerBean<Foo>("foo")
    registerBean("boo"){Boo()}
    registerBean(::fooRouter)
    registerBean(::booRouter)
    registerBean(::newRouter)
}
)
