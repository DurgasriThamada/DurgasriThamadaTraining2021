package AS8.Lambda;

import java.util.*;
import java.util.function.Consumer;

public class Q8 {

	public void numbers(List<Integer> l,Consumer<Integer> consumer) {
		for(int i:l) {
			consumer.accept(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread();
		List<Integer> num=new ArrayList<>();
		num.add(12);
		num.add(10);
		num.add(49);
		num.add(42);
		Thread t1=new Thread(()->num.forEach(i->System.out.println(i)));
		
		t1.start();
	}
	
}
