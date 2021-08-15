import java.util.*;
public class Q7SearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]=new int[16];
		int i=0;
		System.out.println("Enter 15 numbers");
		for(i=0;i<15;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number to search");
		int k=in.nextInt();
		for(i=0;i<15;i++) {
			if(arr[i]==k) {
				System.out.println(k+" is found");
				break;
			}
		}
		if(i==15) {
			System.out.println(k+" is not found");
		}
		in.close();
	}

}
