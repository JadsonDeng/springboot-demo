package com.jadson.study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class InitConfig2 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("init data:2");

    }
}
