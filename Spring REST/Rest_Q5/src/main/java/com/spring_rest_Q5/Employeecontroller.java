package com.spring_rest_Q5;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/helloworld")
public class Employeecontroller {

		Employeeservice employeeservice=new Employeeservice();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/employee")
	public List<Employee> getEmployees() {
		return employeeservice.getAllEmployees();

	}
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee addEmployee(Employee employee) {
		return employeeservice.addEmployee(employee);
	}
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee updateEmployee(Employee employee) {
		return employeeservice.updateEmployee(employee);
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Employee deleteEmployee(@PathParam("id") Long id) {
		return employeeservice.deleteEmployee(id);
	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Employee getEmployee(@PathParam("id") Long id) {
		return employeeservice.getEmployee(id);

	}
	
}
