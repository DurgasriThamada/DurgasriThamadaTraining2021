package AS2.Q2.HierachyOrganisation;
import java.util.*;

class Employee {
	private List<Manager> manager;
	private List<Labour> labour;
	private static double totalSalary;
	public Employee(List<Manager> manager, List<Labour> labour, double totalSalary) {
		super();
		this.manager = manager;
		this.labour = labour;
		Employee.totalSalary = totalSalary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public double getTotalSalary() {
		return Employee.totalSalary;
	}
	public void setTotalSalary(double totalSalary) {
		Employee.totalSalary =Employee.totalSalary+ totalSalary;
	}
	public void addManager(Manager manager) {
		this.manager.add(manager);
	}
	public void addLabour(Labour labour) {
		this.labour.add(labour);
	}
}

class Labour extends Employee{
	private int id;
	private String name;
	private static double salary;
	private int overTime;
	public Labour(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Labour.salary = salary;
		this.overTime = 0;
	}
	public Labour() {
		
	}
	@Override
	public double getTotalSalary() {
		// TODO Auto-generated method stub
		return Labour.salary;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		Labour.salary = salary;
		super.setTotalSalary(salary);
	}
	public int getOverTime() {
		return overTime;
	}
	public void setOverTime(int overTime) {
		this.overTime = overTime;
		Labour.salary=Labour.salary+(overTime*100);
	}
	
}

class Manager extends Employee {
	private int id;
	private String name;
	private static double salary;
	private double incentive;
	public Manager(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Manager.salary = salary;
		this.incentive = 0;
	}
	public Manager() {
		
	}
	@Override
	public double getTotalSalary() {
		// TODO Auto-generated method stub
		return Manager.salary;
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
	public double getSalary() {
		return Manager.salary;
	}
	public void setSalary(double salary) {
		Manager.salary = salary;
		super.setTotalSalary(salary);
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
		Manager.salary=Manager.salary+incentive;
	}
	
}

public class Organisation {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager1=new Manager(1,"Durga",25000);
		manager1.setIncentive(3000);
		double salary=manager1.getSalary();
		Labour labour1=new Labour(1,"Durgasri",12000);
		labour1.setOverTime(3);
		salary+=labour1.getSalary();
		List<Manager> manager=new ArrayList<Manager>();
		manager.add(manager1);
		List<Labour> labour=new ArrayList<Labour>();
		labour.add(labour1);
		Employee employee=new Employee(manager,labour,salary);
		System.out.println("Total salary of all managers:"+manager1.getTotalSalary());
		System.out.println("Total salary of all labour:"+labour1.getTotalSalary());
		System.out.println("Total salary of all employees:"+employee.getTotalSalary());
	}

}
