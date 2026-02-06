package restassuredTest;

import org.testng.annotations.Test;

import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;


public class GetEwquest {

	@Test
	public void getWeatherDetails() {
		given()
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("City",equalTo("Hyderabad"))
		.header("Content-Tupe", "appilcation/json");
	}

	private ResponseAwareMatcher<Response> equalTo(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
