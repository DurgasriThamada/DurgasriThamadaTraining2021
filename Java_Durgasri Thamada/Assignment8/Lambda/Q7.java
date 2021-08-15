package AS8.Lambda;

import java.util.*;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m=new HashMap<>();
		m.put("1", "A");
		m.put("2", "B");
		m.put("3", "C");
		StringBuilder str=new StringBuilder();
		for(Map.Entry tm:m.entrySet()){    
		       str.append(tm.getKey());
		       str.append(tm.getValue());
		      } 
		System.out.println(str);
	}

}
