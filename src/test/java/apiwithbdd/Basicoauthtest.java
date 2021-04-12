package apiwithbdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Basicoauthtest 
{
	@Test
	public void basicAuthtest(){
		given()
		.contentType(ContentType.JSON)
		.baseUri("http://localhost:8084")
		.auth()
		.basic("rmgyantra", "rmg@9999")
		.when()
		.get("/login")
		.then()
		.log().all();
	}

}
