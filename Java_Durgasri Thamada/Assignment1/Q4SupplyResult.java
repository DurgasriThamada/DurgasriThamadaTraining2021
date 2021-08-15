import java.util.*;
public class Q4SupplyResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of three Subjects");
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int cnt=0;
		if(m1>60) {
			cnt+=1;
		}
		if(m2>60) {
			cnt+=1;
		}
		if(m3>60) {
			cnt+=1;
		}
		if(cnt==3) {
			System.out.println("Passed");
		}
		else if(cnt==2) {
			System.out.println("Promoted");
		}
		else if(cnt==1) {
			System.out.println("Failed");
		}
		sc.close();
	}

}
