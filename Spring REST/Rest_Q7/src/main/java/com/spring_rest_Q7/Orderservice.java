package com.spring_rest_Q7;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Orderservice {
	private static Map<Long,Orders> orders=Database.getOrders();
    public Orderservice() {
    	orders.put(1L, new Orders(1,"Apple",20,"Good",60000L));
    	orders.put(2L, new Orders(2,"Mango",30,"Juicy",78000L));
    	
    }
    public List<Orders> getAllOrders(){
    	return new ArrayList<Orders>(orders.values());
    }
    public Orders getOrders(Long id) {
		return orders.get(id);
    	
    }
    public Orders addOrders(Orders order) {
		order.setId(orders.size()+1);
		orders.put(order.getId(),order);
		return order;
	}
    public Orders updateOrders(Orders order) {
		if(order.getId()<=0)
		{
			return null;
		}
		orders.put(order.getId(),order);
		return order;
	}
    public Orders deleteOrders(Long id) {
		return orders.remove(id);
	}

}
