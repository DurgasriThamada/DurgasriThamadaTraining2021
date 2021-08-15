package AS7.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Execute
{
	int Sequence();
}

class Ex{
	@Execute(Sequence=2)
	public void method1() {
		System.out.println("Method 1");
	}
	@Execute(Sequence=1)
	public void method2() {
		System.out.println("Method 2");
	}
	@Execute(Sequence=3)
	public void method3() {
		System.out.println("Method 3");
	}
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex e=new Ex();
		e.method2();
		e.method1();
		e.method3();
	}

}
