package com.test.stepdefs;

import com.test.context.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ApiSteps {

    @Autowired
    TestContext testContext;


    @Given("the test app")
    public void endPoint(){
        System.out.println("test");
    }

    @When("client request {word} details")
    public void clientRequestAccountsDetails(String endPoint) {
        System.out.println(endPoint);
    }

    @Then("status code should be {int}")
    public void statusCodeCheck(int arg0) {
        System.out.println(arg0);
    }

    @And("response body should not be empty")
    public void responseBodyCheck() {

    }
}
