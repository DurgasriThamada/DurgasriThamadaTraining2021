import java.util.*;
public class Q3SimpleCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Principal amount");
		int principal=in.nextInt();
		System.out.println("Enter the Rate of Interest");
		int rate=in.nextInt();
		System.out.println("Enter the time period");
		int time=in.nextInt();
		int SI= (principal*rate*time);
		int CI=(int) ((principal * Math.pow((1+rate),time))-principal);
		System.out.println("Simple Interest: "+SI);
		System.out.println("Compound Interest: "+CI);
		in.close();
	}

}
