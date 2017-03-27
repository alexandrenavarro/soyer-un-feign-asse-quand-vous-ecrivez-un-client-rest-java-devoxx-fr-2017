package com.github.alexandrenavarro.feign;

import com.github.alexandrenavarro.Contributor;
import feign.Feign;
import feign.jackson.JacksonDecoder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.util.List;

/**
 * Created by anavarro on 26/03/17.
 */
@Slf4j
public class GithubWithFeignApplication {

    public static void main(String... args) {
        final GithubWithFeignResource githubWithFeignResource = Feign.builder()
                .decoder(new JacksonDecoder())
                .target(GithubWithFeignResource.class, "https://api.github.com");

        final List<Contributor> contributors = githubWithFeignResource.contributors("OpenFeign", "feign");
        log.info("contributors:{}", contributors);
    }
}

