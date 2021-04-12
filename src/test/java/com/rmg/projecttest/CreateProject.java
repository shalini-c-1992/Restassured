package com.rmg.projecttest;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProject
{
	@Test
	public void postproject(){
		//JSONObject jobject = new JSONObject();
		HashMap jobject = new HashMap();
		jobject.put("createdby", "shalini");
		jobject.put("projectName", "Zoho");
		jobject.put("status", "created");
		jobject.put("teamsize", 5);
		RequestSpecification req = RestAssured.given();
		req.contentType(ContentType.JSON);
		req.body(jobject);
		Response resp = req.post("http://localhost:8084/addProject");
		
		String completelybody = resp.prettyPrint();
		System.out.println(completelybody);
		
		int actsc = resp.getStatusCode();
		System.out.println(actsc);
		
		String actct = resp.getContentType();
		System.out.println(actct);
		
	}
}
