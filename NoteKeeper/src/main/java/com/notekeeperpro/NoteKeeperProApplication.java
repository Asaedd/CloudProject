package com.notekeeperpro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.notekeeperpro.core.Model")
public class NoteKeeperProApplication {
    public static void main(String[] args) {
        SpringApplication.run(NoteKeeperProApplication.class, args);
    }
}
