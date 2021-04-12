package com.rmg.apitest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAllProject 
{
	@Test
	public void getproject(){
		given()
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		.when()
		.get("/projects")
		.then()
		.log().all(); //like pretty print()
		
	}
	
	@Test
	public void getProjectbypathparameter(){
		given()
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		.when()
		.get("/projects/TY_PROJ_604")
		.then()
		.log().all();
	}

}
