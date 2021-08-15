package AS2.Q4.AbstractPrinciples;

abstract class Ex{
	public abstract void method1();
	public abstract void method2();
	public abstract void method3();
}
/*
 * There's no need to implement all the abstract methods 
 * of an abstract class if the class is declared as abstract
 * when it extends an abstract class
 */
abstract class Ex1 extends Ex{
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}
}
/*
 * if a class extends abstract class then it must 
 * implement all the abstract methods or else it 
 * gives an error
 */
public class Principle3 extends Ex {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
