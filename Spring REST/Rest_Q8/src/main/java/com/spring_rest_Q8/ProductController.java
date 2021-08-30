package com.spring_rest_Q8;

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
public class ProductController {

		Productservice productservice=new Productservice();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/product")
	public List<Product> getProducts() {
		return productservice.getAllProducts();

	}
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Product addProduct(Product employee) {
		return productservice.addProduct(employee);
	}
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Product updateProduct(Product product) {
		return productservice.updateProduct(product);
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public Product deleteProduct(@PathParam("id") Long id) {
		return productservice.deleteProduct(id);
	}
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{id}")
	public Product getProduct(@PathParam("id") Long id) {
		return productservice.getProduct(id);

	}
	
}

