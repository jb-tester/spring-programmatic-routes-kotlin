package com.mytests.spring.springprogrammaticrouteskotlin

import org.springframework.beans.factory.BeanRegistrarDsl

class MyBeansRegistrar : BeanRegistrarDsl({
    registerBean<Foo>("foo")
    registerBean("boo"){Boo()}
    registerBean { NewRouterHandler() }
    registerBean{ FooRouter.fooRouter(bean())}
    registerBean{booRouter(bean<Boo>("boo"))}
    registerBean(name = "newRouter"){newRouter(bean())}
}
)
