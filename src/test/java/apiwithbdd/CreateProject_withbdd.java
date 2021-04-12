package apiwithbdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProject_withbdd
{
	@Test
	public void Createproject(){
		
		JSONObject jobject = new JSONObject();
		jobject.put("createdBy", "shalini");
		jobject.put("createdOn", "06-04-2021");
		jobject.put("projectName", "Vtiger");
		jobject.put("status", "completed");
		jobject.put("teamsize", 10);
		
		given()
		.contentType(ContentType.JSON)
		.body(jobject)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		.log().all()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON);
		
		
		
		
	}
}
