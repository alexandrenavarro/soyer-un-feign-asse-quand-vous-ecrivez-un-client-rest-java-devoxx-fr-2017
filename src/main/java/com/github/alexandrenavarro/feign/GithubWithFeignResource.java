package com.github.alexandrenavarro.feign;

import com.github.alexandrenavarro.Contributor;
import feign.Param;
import feign.RequestLine;

import java.util.List;

/**
 * Created by anavarro on 26/03/17.
 */
public interface GithubWithFeignResource {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);
}


