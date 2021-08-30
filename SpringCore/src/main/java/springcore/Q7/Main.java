package springcore.Q7;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[]args)
	{
		ApplicationContext obj = new ClassPathXmlApplicationContext("core7.xml");
		
		BookLibrary booklibrary = obj.getBean("Booklibrary",BookLibrary.class);
		
		List<Book> allBooks = booklibrary.getAllBooks();
		
		for(Book i: allBooks)
		{
			System.out.println(i.getBookId()+"\t"+i.getBookName());
			
		}
		
		Book book= booklibrary.getGetFirstBook();
		System.out.println("\n"+book.getBookId()+"\t"+book.getBookName());
		
	}
}
