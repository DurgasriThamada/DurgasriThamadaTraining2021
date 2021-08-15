package AS5.Generics;

import java.util.*;

class Employee{
	private int id;
	private String name;
	private double salary;
	private String department;
	
	public Employee(int id, String name, double salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public void displayDetails() {
		System.out.println("ID: "+this.id+", Name: "+this.name+", Department: "+this.department);
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> h=new HashSet<>();
		Employee e1=new Employee(1,"Employee1",10000,"CSE");
		Employee e2=new Employee(2,"Employee2",1200,"ECE");
		h.add(e1);
		h.add(e2);
		Iterator<Employee> itr=h.iterator();
		while(itr.hasNext()) {
			itr.next().displayDetails();
		}
	}

}
