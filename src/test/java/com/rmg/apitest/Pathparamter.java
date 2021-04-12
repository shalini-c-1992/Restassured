package com.rmg.apitest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Pathparamter {
	@Test
	public void getproject(){
		given()
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084");
		//.pathParam(3, arg1)
	}

}
