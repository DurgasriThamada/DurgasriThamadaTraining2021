package AS7.Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test
{
	String value() default "The following method is a test-case";
}
class AnnotationDemo{
	@Test
	public void demo() {
		System.out.println("This is a test-case method");
	}
}
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationDemo d=new AnnotationDemo();
		d.demo();
	}

}
