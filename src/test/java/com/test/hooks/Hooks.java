package com.test.hooks;

import com.test.context.TestContext;
import com.test.context.TestEnvironment;
import core.api.RestClient;
import io.cucumber.java.Before;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = { TestContext.class, TestEnvironment.class} )
public class Hooks {

    @Autowired
    TestEnvironment testEnvironment;

    @Autowired
    TestContext testContext;


    @Before("@api")
    public void initRestClient() {
        testContext.setRestClient(new RestClient(testEnvironment.getHost(), testEnvironment.getPort(), null));
    }

}
