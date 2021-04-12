package com.rmg.projecttest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Createprojectusingpojoclass
{
	@Test
	public void createprojecttest(){
		
		Projectpojo reqbody = new Projectpojo("shalini", "06-04-21", "Vtiger", "created", 10);
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(reqbody);
		
		Response res = req.post("http://localhost:8084/addProject");
		System.out.println(res.getStatusCode());
		
		res.prettyPrint();
	}
}
