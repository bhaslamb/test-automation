package core.api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestClient {

    private final String host;
    private final int port;
    private final Map<String, String> headers;

    public RestClient(String host, int port, Map<String, String> headers) {
        this.host = host;
        this.port = port;
        this.headers = headers;
    }

    public Response get(String endPoint, Map<String, Object> params) {
        return requestSpecification().queryParams(params).get(endPoint)
                .then()
                .log()
                .all().extract().response();
    }

    public Response post(String endPoint, byte[] requestBody) {
        return requestSpecification().body(requestBody).post(endPoint)
                .then()
                .log()
                .all().extract().response();
    }

    public RequestSpecification requestSpecification() {
        return RestAssured.given().relaxedHTTPSValidation().log().all(true).baseUri(this.host)
                .port(this.port).headers(this.headers);
    }
}
