package demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetRequestUsingRestAssured {
	
	
	@Test
	public void getUser(){
		
		//Specify Base URI 
		RestAssured.baseURI = "https://reqres.in"; 
		
		//Create Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		
		//Create Response Object 
		
		Response response = httpRequest.request(Method.GET,"/api/users/2");
		
		//Print Response in console
		String responseBody = response.getBody().asPrettyString();
		System.out.println("Response Body is : "+ responseBody);
		
		//Status Code Validation
		Assert.assertEquals(200, response.getStatusCode());
		
		//Status Line verification
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine,"HTTP/1.1 200 OK");
	}
	
	

}
