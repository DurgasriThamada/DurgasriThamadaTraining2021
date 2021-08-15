import java.util.*;
public class Q5IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the CTC");
		int ctc=in.nextInt();
		double tax=0;
		if(ctc>=0 && ctc<=180000) {
			System.out.println("Tax amount is 0");
		}
		else if(ctc>=181001 && ctc<=300000) {
			tax=(ctc*0.1);
			System.out.println("Tax amount is "+tax);
		}
		else if(ctc>=300001 && ctc<=500000) {
			tax=(ctc*0.2);
			System.out.println("Tax amount is "+tax);
		}
		else if(ctc>=500001 && ctc<= 1000000) {
			tax=(ctc*0.3);
			System.out.println("Tax amount is "+tax);
		}
		in.close();
	}

}
