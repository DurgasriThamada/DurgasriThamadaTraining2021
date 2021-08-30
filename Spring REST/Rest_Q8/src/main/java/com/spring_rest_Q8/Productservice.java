package com.spring_rest_Q8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class Productservice {
	private static Map<Long,Product> products=Database.getProducts();
    public Productservice() {
    	products.put(1L, new Product(1L,"AC",20000));
    	products.put(2L, new Product(2L,"Fan",3000));
    	
    }
    public List<Product> getAllProducts(){
    	return new ArrayList<Product>(products.values());
    }
    public Product getProduct(Long id) {
		return products.get(id);
    	
    }
    
	
	public Product addProduct(Product product) {
		product.setId((long) (products.size()+1));
		products.put(product.getId(),product);
		return product;
	}
	public Product updateProduct(Product product) {
		if(product.getId()<=0)
		{
			return null;
		}
		products.put(product.getId(),product);
		return product;
	}
	
	public Product deleteProduct(Long id) {
		return products.remove(id);
	}
	
	
	


	
}


