package com.spring_rest_Q7;

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
public class OrderController {
	
	Orderservice orderservice=new Orderservice();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/orders")
	public List<Orders> getOrders() {
		return orderservice.getAllOrders();

	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Orders getOrders(@PathParam("id") Long id) {
		return orderservice.getOrders(id);

	}
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Orders addOrders(Orders order) {
		return orderservice.addOrders(order);
	}
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Orders updateOrders(Orders order) {
		return orderservice.updateOrders(order);
	}
	@DELETE	
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Orders deleteOrders(@PathParam("id") Long id) {
		return orderservice.deleteOrders(id);
	}

}
