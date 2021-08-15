package AS8.Collections;
import java.util.*;
import java.time.*;
public class Q4 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Date> ld=new LinkedList<>();
		ld.add(new Date(2000,0,12));
		ld.add(new Date(2103,2,19));
		ld.add(new Date(1924,3,21));
		for(int i=ld.size()-1;i>=0;i--) {
			System.out.println("Your date of birth is "+ld.get(i).getDate()+"-"+(ld.get(i).getMonth()+1)+"-"+ld.get(i).getYear()+" and it was "+(Year.of(ld.get(i).getYear()).isLeap()?"a Leap Year":"Not a Leap Year"));
		}
	}

}
