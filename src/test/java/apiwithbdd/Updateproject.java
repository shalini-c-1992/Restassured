package apiwithbdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Updateproject
{
	@Test
	public void updateproj(){
		JSONObject jobject = new JSONObject();
		jobject.put("projectName", "Vtiger-001");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobject)
		.when()
		.patch("http://localhost:8084/projects"+"TY_PROJ_609")
		.then()
		//.assertThat().statusCode(201)
		//.assertThat().contentType(ContentType.JSON)
		.log().all();
		
	}
}
//patch rmgyantra wont support

