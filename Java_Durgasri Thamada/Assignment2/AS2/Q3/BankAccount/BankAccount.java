package AS2.Q3.BankAccount;

import java.util.ArrayList;
import java.util.List;

class Bank{
	private List<SavingsAccount> savings;
	private List<CurrentAccount> current;
	private int totalCash;
	public Bank(List<SavingsAccount> savings, List<CurrentAccount> current, int totalCash) {
		super();
		this.savings = savings;
		this.current = current;
		this.totalCash = totalCash;
	}
	public Bank() {
		
	}
	public List<SavingsAccount> getSavings() {
		return savings;
	}
	public void setSavings(List<SavingsAccount> savings) {
		this.savings = savings;
	}
	public List<CurrentAccount> getCurrent() {
		return current;
	}
	public void setCurrent(List<CurrentAccount> current) {
		this.current = current;
	}
	public int getTotalCash() {
		return totalCash;
	}
	public void setTotalCash(int totalCash) {
		this.totalCash = totalCash;
	}
	@Override
	public String toString() {
		return "Bank [savings=" + savings + ", current=" + current + ", totalCash=" + totalCash + "]";
	}
	
}
class SavingsAccount extends Bank{
	private int amount;
	private int id;
	private String name;
	public SavingsAccount(int amount, int id, String name) {
		super();
		this.amount = amount;
		this.id = id;
		this.name = name;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setAmount(int amount) {
		super.setTotalCash(this.amount);
		this.amount = amount;
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
	@Override
	public String toString() {
		return "SavingsAccount [amount=" + amount + ", id=" + id + ", name=" + name + "]";
	}
	
}
class CurrentAccount extends Bank{
	private int amount;
	private int id;
	private String name;
	public CurrentAccount(int amount, int id, String name) {
		super();
		this.amount = amount;
		this.id = id;
		this.name = name;
	}
	public int getAmount() {
		return this.amount;
	}
	public void setAmount(int amount) {
		super.setTotalCash(this.amount);
		this.amount = amount;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "CurrentAccount [amount=" + amount + ", id=" + id + ", name=" + name + "]";
	}
	
}
public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount sacc=new SavingsAccount(20000,1,"Mathew");
		CurrentAccount cacc=new CurrentAccount(30000,2,"Mary");
		List<SavingsAccount> s=new ArrayList<>();
		s.add(sacc);
		List<CurrentAccount> c=new ArrayList<>();
		c.add(cacc);
		Bank b=new Bank(s,c,10000);
		s.get(0).setAmount(2000);
		c.get(0).setAmount(399);
		System.out.println(b.getTotalCash()+sacc.getAmount()+cacc.getAmount());
		
	}

}
