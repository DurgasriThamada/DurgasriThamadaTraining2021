package com.spring_rest_Q6;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
@Path("/helloworld")
public class Calculate{
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/add/{a},{b}")
	public String sumoftwo(@Context HttpHeaders httpHeaders,@PathParam("a") int a,@PathParam("b") int b) {
		int c=a+b;
		return("Addition of two numbers is "+c); 
		
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sub/{a},{b}")
	public String suboftwo(@Context HttpHeaders httpHeaders,@PathParam("a") int a,@PathParam("b") int b) {
		int c=a-b;
		return("Subtraction of two numbers is "+c); 
		
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/mul/{a},{b}")
	public String muloftwo(@Context HttpHeaders httpHeaders,@PathParam("a") int a,@PathParam("b") int b) {
		int c=a*b;
		return("Multiplication of two numbers is "+c); 
		
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/div/{a},{b}")
	public String divoftwo(@Context HttpHeaders httpHeaders,@PathParam("a") int a,@PathParam("b") int b) {
		int c=a/b;
		return("Division of two numbers is "+c); 
		
	}
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/sqrt/{a}")
	public String sqrtoftwo(@Context HttpHeaders httpHeaders,@PathParam("a") int a,@PathParam("b") int b) {
		double c=Math.sqrt(a);
		return("Square root of number is "+c); 
		
	}
}
