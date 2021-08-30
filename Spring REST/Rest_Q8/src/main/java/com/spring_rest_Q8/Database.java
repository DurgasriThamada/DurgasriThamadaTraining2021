package com.spring_rest_Q8;

import java.util.HashMap;
import java.util.Map;

public class Database {
	private static Map<Long,Product> products=new HashMap<>();
	public static Map<Long,Product> getProducts(){
		return products;
	}
}
