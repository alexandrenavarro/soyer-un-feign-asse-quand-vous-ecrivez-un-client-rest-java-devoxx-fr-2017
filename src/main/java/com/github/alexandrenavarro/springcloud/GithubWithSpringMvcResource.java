package com.github.alexandrenavarro.springcloud;

import com.github.alexandrenavarro.Contributor;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by anavarro on 26/03/17.
 */
@FeignClient(url = "https://api.github.com", name = "github") // remove url if github is your name in your eureka
public interface GithubWithSpringMvcResource {

    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@PathVariable("owner") String owner, @PathVariable("repo") String repo);
}


