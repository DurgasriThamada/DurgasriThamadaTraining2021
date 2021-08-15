import java.util.*;
public class Q1ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number?");
		int num=sc.nextInt();
		int k=num;
		int sum=0,rem=0;
		while(k!=0) {
			rem=k%10;
			sum+=(rem*rem*rem);
			k=k/10;
		}
		if(sum==num) {
		System.out.println(sum+" is an Amstrong number");
		}
		else {
			System.out.println(num+" is not an Amstrong number");
			}
		sc.close();
	}

}
