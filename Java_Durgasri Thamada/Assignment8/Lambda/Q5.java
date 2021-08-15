package AS8.Lambda;
import java.util.*;
import java.util.function.Consumer;
class stringLetter{
	public static StringBuilder add(List<String> l, Consumer<String> consumer) {
		StringBuilder str=new StringBuilder();
		for(String s:l) {
			consumer.accept(s);
			str.append(s.charAt(0));
		}
		return str;
	}
}
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("Door");
		l.add("Umbrella");
		l.add("Rose");
		l.add("Group");
		l.add("Ant");
		StringBuilder str=new StringBuilder();
		str=stringLetter.add(l, p->p.length());
		
	    System.out.println(str);
	}

}
