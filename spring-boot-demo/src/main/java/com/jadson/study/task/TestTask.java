package com.jadson.study.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestTask {

    @Scheduled(cron = "0 0/1 5-23 * * ?")
    public void execute() {
        System.out.println("this is in task:" + System.currentTimeMillis());
    }
}
