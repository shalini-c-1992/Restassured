package apiwithbdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Getallproject {
	
	@Test
	public void getallprojects(){
	when()
	.get("http://localhost:8084/projects")
	.then()
	.assertThat().statusCode(200)
	.assertThat().contentType(ContentType.JSON)
	.log().all();
	}

}
