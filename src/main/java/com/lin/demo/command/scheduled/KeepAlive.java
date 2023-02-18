package com.lin.demo.command.scheduled;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author zhen.lin
 * @date 2023/2/18 12:08
 */
@EnableScheduling
@Service
public class KeepAlive {

    @Scheduled(initialDelay=1000, fixedDelay=1000)
    public void heartbeat() {
        // no code, keep application running
        System.out.println("heartbeat");
    }
}
