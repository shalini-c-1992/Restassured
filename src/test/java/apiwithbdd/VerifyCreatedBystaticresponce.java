package apiwithbdd;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class VerifyCreatedBystaticresponce
{
	@Test
	public void verifycreatedbystaticresponce(){
		String expecteddata = "shalini";
		
		Response resp = when()
				.get("http://localhost:8084/projects");
				String actdata = resp.jsonPath().getString("[0].createdBy");
				resp.then()
				.log().all();
				Assert.assertEquals(actdata, expecteddata);
	}
}
