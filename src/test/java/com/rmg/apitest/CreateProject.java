package com.rmg.apitest;

import org.testng.annotations.Test;

import com.rmg.projecttest.Projectpojo;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject {

	@Test
	public void createProject(){
		Projectpojo project = new Projectpojo("shalini", "06-04-21", "Vtiger", "created", 5);
		given()
		.body(project)
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		
		.when()
		.post("/addProject")
		.then()
		.log().all();
	}
}
