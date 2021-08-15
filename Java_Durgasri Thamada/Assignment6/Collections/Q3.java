package AS8.Collections;
import java.util.*;
class Employee{
	private int id;
	private String name;
	private String department;
	private double salary;
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}
class SortId implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return (e1.getId()-e2.getId());
	}
	
}
class SortName implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}
	
}
class SortDepartment implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
	
}
class sortSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getSalary()-o2.getSalary());
	}
	
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Employee e1=new Employee(1,"Aa","CSE",23000);
		Employee e2=new Employee(3,"Cc","ECE",34000);
		Employee e3=new Employee(2,"Bb","CIVIL",20000);
		System.out.println("a.ID\nb.Name\nc.Department\nd.salary\ne.Exit");
		int flag=0;
		while(true) {
			System.out.println("Enter your choice");
			String ch=in.next();
			flag=0;
			switch(ch) {
			case "a":
				TreeSet<Employee> tid=new TreeSet<>(new SortId());
				tid.add(e1);
				tid.add(e2);
				tid.add(e3);
				for(Employee e:tid) {
					System.out.println(e);
				}
				break;
			case "b":
				TreeSet<Employee> tname=new TreeSet<>(new SortName());
				tname.add(e1);
				tname.add(e2);
				tname.add(e3);
				for(Employee e:tname) {
					System.out.println(e);
				}
				break;
			case "c":
				TreeSet<Employee> tdep=new TreeSet<>(new SortDepartment());
				tdep.add(e1);
				tdep.add(e2);
				tdep.add(e3);
				for(Employee e:tdep) {
					System.out.println(e);
				}
				break;
			case "d":
				TreeSet<Employee> tsal=new TreeSet<>(new sortSalary());
				tsal.add(e1);
				tsal.add(e2);
				tsal.add(e3);
				for(Employee e:tsal) {
					System.out.println(e);
				}
				break;
			default:
				flag=1;
				break;
			}
			if(flag==1) {
				break;
			}
		}
	}

}
