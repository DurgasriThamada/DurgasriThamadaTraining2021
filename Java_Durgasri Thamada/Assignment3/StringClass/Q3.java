package AS3.StringClass;

public class Q3 {
	public static void main(String argsp[] ) {
		String s=new String("Java String pool refers to collection of Strings which are stored in heap memory");
		System.out.println("The original string: "+s);
		System.out.println("Lowercase: "+s.toLowerCase());
		System.out.println("Uppercase: "+s.toUpperCase());
		System.out.println("Replace 'a' with '$' : "+ s.replace('a','$'));
		System.out.println("Search for 'collection': "+(s.contains("collection")?"Found":"NotFoun"));
		System.out.println("Comparision: "+(s.compareTo("java string pool refers to collection of strings which are stored in heap memory")==0?"Matches":"Not matches"));
		System.out.println("Equal: "+(s.equals("java string pool refers to collection of strings which are stored in heap memory")?"Equals":"Not equals"));
		
	}
}
