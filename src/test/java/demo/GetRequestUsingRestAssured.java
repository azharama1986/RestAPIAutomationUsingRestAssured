package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequestUsingRestAssured {
	
	
	@Test
	public void getWeatherDetails(){
		
		//Specify Base URI 
		RestAssured.baseURI = "http://restapi.demoqa.com/utilitie/weather/city"; 
		
		//Create Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Create Response Object 
		
		Response response = httpRequest.request(Method.GET,"/Hyderabad");
		
		//Print Response in console
		String responseBody = response.getBody().asPrettyString();
		System.out.println("Response Body is : "+ responseBody);	
	}
	
	

}
