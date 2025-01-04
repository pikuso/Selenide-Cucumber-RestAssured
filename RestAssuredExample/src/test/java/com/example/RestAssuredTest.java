package com.example;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

    @Test
    public void testGetRequest() {
        RestAssured.given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .when()
            .get("/todos/1")
            .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("title", equalTo("delectus aut autem"));
    }
}
