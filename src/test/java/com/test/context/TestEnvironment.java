package com.test.context;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Getter
@Configuration
@PropertySource(value = "classpath:env.properties")
public class TestEnvironment {

    @Value("${api.host}")
    private String host;

    @Value("${api.port}")
    private int port;

}
