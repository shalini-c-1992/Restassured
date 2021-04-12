package com.rmg.projecttest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUDoperation {
	
	@Test
	public void createtest(){
		JSONObject js = new JSONObject();
		js.put("createdBy", "shalini");
		js.put("createdOn", "05-04-2021");
		js.put("projectId", "1234");
		js.put("status", "ongoing");
		js.put("teamsize", 10);
		
		RequestSpecification req = RestAssured.given().baseUri("http://localhost:8084/addProject")
		.contentType(ContentType.JSON)
		.body(js);
		Response res = req.post("/addProject");
		res.prettyPrint();
		
	}
	
	@Test
	public void getoperation(){
		RestAssured.get("http://localhost:8084/projects").prettyPrint();
	}
	
	@Test
	public void getoperationwithId(){
		RestAssured.get("http://localhost:8084/projects/TY_PROJ_604").prettyPrint();
	}
	
	@Test
	public void updateoperation(){
		JSONObject js = new JSONObject();
		js.put("createdBy", "shalini");
		js.put("createdOn", "05-04-2021");
		js.put("projectId", "1234");
		js.put("status", "completed");
		js.put("teamsize", 10);
		
		RequestSpecification updatereq = RestAssured.given().baseUri("http://localhost:8084/projects/{projectId}")
		.contentType(ContentType.JSON)
		.body(js);
		updatereq.put("/projects/TY_PROJ_604").prettyPrint();
	}
	
	@Test
	public void deleteoperation(){
		RestAssured.delete("http://localhost:8084/projects/TY_PROJ_604").prettyPrint();
	}

}
