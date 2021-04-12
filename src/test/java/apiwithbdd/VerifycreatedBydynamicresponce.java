package apiwithbdd;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class VerifycreatedBydynamicresponce
{
	@Test
	public void verifycreatedBy(){
		
		String expecteddata = "shalini";
		
		Response resp = when()
				.get("http://localhost:8084/projects");
		 	 List<String> list = resp.jsonPath().get("createdBy");
		for(String str:list){
			if(str.equals(expecteddata)){
				System.out.println(expecteddata+" ==> is available in dynamic responce");
				break;
			}
		}
		
	}
}
