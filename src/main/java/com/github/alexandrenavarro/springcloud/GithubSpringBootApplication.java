package com.github.alexandrenavarro.springcloud;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by anavarro on 27/03/17.
 */
@SpringBootApplication
@EnableFeignClients(basePackageClasses = {GithubWithSpringMvcResource.class})
public class GithubSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubSpringBootApplication.class, args);
    }
}


