package com.example.springcloudauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.yuequan.watchdog.configuration.EnableWatchDog;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWatchDog
public class SpringcloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudAuthApplication.class, args);
    }
}
