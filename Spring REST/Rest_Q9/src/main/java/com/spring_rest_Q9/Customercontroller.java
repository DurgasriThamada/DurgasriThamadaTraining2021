
package com.spring_rest_Q9;

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
public class Customercontroller {

		Customerservice customerservice=new Customerservice();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/customer")
	public List<Customer> getCustomers() {
		return customerservice.getAllCustomers();

	}
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Customer addCustomer(Customer customer) {
		return customerservice.addCustomer(customer);
	}
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Customer updateCustomer(Customer customer) {
		return customerservice.updateCustomer(customer);
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Customer deleteCustomer(@PathParam("id") Long id) {
		return customerservice.deleteCustomer(id);
	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Customer getCustomer(@PathParam("id") Long id) {
		return customerservice.getCustomer(id);

	}
	
}

