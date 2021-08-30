package com.spring_rest_Q9;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Long,Customer> customers=new HashMap<>();
	public static Map<Long,Customer> getCustomers(){
		return customers;
	}
	

}