package AS5.Generics;
import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Double> m=new HashMap<>();
		Random rd=new Random();
		int i;
		for(i=0;i<10;i++) {
			m.put(rd.nextInt(), rd.nextDouble());
		}
		for(Map.Entry<Integer, Double> e: m.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}

}
