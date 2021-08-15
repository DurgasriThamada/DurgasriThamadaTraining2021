package AS7.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Info
{
	int AuthorID();
	String Author() default "Developer's Name";
	String Supervisor() default "Developer's Supervisor";
	String Date();
	String Time();
	String Version();
	String Description() default "Description";
}
class Developer{
	@Info(AuthorID = 1, Date = "12-08-2021", Time = "04:30PM", Version = "8")
	public void method() {
		System.out.println("HELLO");
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d=new Developer();
		d.method();
	}

}
