package com.example.runner;


import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
@Order(3)
public class AppStartupRunner implements CommandLineRunner {

    private final DataSource dataSource;

    public AppStartupRunner(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Connected to the MySQL DataSource: " + dataSource.getClass().getName());
    }
}