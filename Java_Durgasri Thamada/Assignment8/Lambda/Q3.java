package AS8.Lambda;

import java.util.*;
import java.util.function.*;

class Person{
	private String Fname;
	private String Lname;
	private int age;
	
	public Person(String fname, String lname, int age) {
		super();
		Fname = fname;
		Lname = lname;
		this.age = age;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [Fname=" + Fname + ", Lname=" + Lname + ", age=" + age + "]";
	}
	
	
}

public class Q3 {

	public static void test(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p:people) {
			if(predicate.test(p)  ) {
				consumer.accept(p);
			}
		}
	}
	public static List<Person> demo(List<Person> people,Function<Person,Person> function) {
		List<Person> Fname=new ArrayList<>();
		for(Person p:people) {
			Fname.add(function.apply(p));
		}
		return Fname;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people=new ArrayList<>();
		people.add(new Person("John","Mathew",34));
		people.add(new Person("Steven","George",23));
		people.add(new Person("Micheal","Sheeren",49));
		Supplier<Person> s=()-> new Person("Charles","Dickens",29);
		Person pi=s.get();
		System.out.println(pi);
		System.out.println("People:");
		test(people,p->true,p->System.out.println(p.getFname()+p.getLname()));
		System.out.println("First names:");
		List<Person> l=demo(people,Function.identity());
		l.forEach(System.out::println);
	}

}
