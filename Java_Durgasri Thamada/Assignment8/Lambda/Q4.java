package AS8.Lambda;
import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words=new ArrayList<>();
		words.add("HI");
		words.add("Hello");
		words.add("welcome");
		words.removeIf(w->(w.length() % 2!=0));
		words.forEach(System.out::println);
	}

}
