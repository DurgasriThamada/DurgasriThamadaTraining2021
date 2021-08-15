package AS8.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new ArrayList<>();
		l.add("Door");
		l.add("Umbrella");
		l.add("Rose");
		l.add("Group");
		l.add("Ant");
		StringBuilder str=new StringBuilder();
		List<String> ln=demo(l,UnaryOperator.identity());
		ln.forEach(System.out::println);
	}

	private static List<String> demo(List<String> l, UnaryOperator<Object> identity) {
		// TODO Auto-generated method stub
		l.replaceAll(e-> e.toUpperCase());
		return l;
	}

}
