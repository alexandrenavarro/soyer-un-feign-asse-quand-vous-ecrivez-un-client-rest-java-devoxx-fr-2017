package com.github.alexandrenavarro.springcloud;

import com.github.alexandrenavarro.Contributor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by anavarro on 27/03/17.
 */
@Slf4j
@Component
public class GithubCommandLineRunner implements CommandLineRunner {

    private final GithubWithSpringMvcResource githubWithSpringMvcResource;

    public GithubCommandLineRunner(final GithubWithSpringMvcResource githubWithSpringMvcResource) {
        this.githubWithSpringMvcResource = githubWithSpringMvcResource;
    }

    @Override
    public void run(String... strings) throws Exception {
        final List<Contributor> contributors = githubWithSpringMvcResource.contributors("OpenFeign", "feign");
        log.info("contributors:{}", contributors);
    }
}


