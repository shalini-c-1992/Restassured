package apiwithbdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class DeleteProject
{
	@Test
	public void deleteproj(){
		when()
		.delete("http://localhost:8084/projects/"+"TY_PROJ_002")
		.then()
		.assertThat().statusCode(204)
		.assertThat().contentType(ContentType.JSON)
		.log().all();
	}
}
