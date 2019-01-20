package com.sherlock.learn.spring.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinLauncher.class, args);
    }
}
