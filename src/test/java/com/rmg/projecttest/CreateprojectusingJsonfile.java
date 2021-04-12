package com.rmg.projecttest;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateprojectusingJsonfile {

	@Test
	public void createprojusingjsonfiletest(){
		
		RequestSpecification reqspec = RestAssured.given();
		reqspec.contentType(ContentType.JSON);
		reqspec.body(new File(".\\Testdata.json"));
		
		Response res = reqspec.post("http://localhost:8084/addProject");
		System.out.println(res.getContentType());
		System.out.println(res.getStatusCode());
		
		res.prettyPrint();
	}
}
