package com.test.context;

import core.api.RestClient;
import io.restassured.response.Response;
import lombok.Data;

@Data
public class TestContext {
    private RestClient restClient;
    private Response lastResponse;

}


