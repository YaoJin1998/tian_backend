package com.xmut.tian_backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xmut.tian_backend.mapper")
@SpringBootApplication
public class TianBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TianBackendApplication.class, args);
    }

}
