package AS4.ExceptionHandling;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int x=in.nextInt();
		int y=in.nextInt();
		try {
			if(y>0) {
				System.out.println(x/y);
			}
			else {
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		in.close();
	}

}
