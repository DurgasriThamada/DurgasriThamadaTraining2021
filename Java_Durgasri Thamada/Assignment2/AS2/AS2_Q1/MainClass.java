package AS2_Q1;
/*
 * It is showing an error that MainClass can't inherit Singleton class
 * as it is a final class.
 */
final class Singleton{
	private int x;
	private int y;
	Singleton(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int add() {
		return this.x+this.y;
	}
}

public class MainClass extends Singleton{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s=new Singleton(2,3);
		System.out.println(s.add());
	}

}
