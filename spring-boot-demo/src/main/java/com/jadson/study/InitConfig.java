package com.jadson.study;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class InitConfig implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("init data:1");
    }
}
