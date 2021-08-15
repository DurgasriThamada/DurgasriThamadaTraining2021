package AS2.Q4.AbstractPrinciples;

abstract class Principle {
	public abstract void display();
	public void displayPrinciple() {
		System.out.println("Abstract classes cannot be instantiated");
	}
}

/*
 * If we try to instantiate the abstract class
 * i.e., creating object it shows error saying 
 * cannot instantiate
 */
public class Principle2 {
	public static void main(String args[]) {
		Principle p=new Principle();
		p.displayPrinciple();
	}
}
