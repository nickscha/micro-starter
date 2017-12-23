package com.nickscha.micro.hello;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloService {

    public String sayHello() {
        return "hello (" + System.currentTimeMillis() + ")";
    }

}
