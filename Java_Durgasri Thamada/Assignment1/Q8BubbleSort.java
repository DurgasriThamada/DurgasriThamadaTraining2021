import java.util.*;
public class Q8BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int arr[]=new int[16];
		int i=0,j=0,k;
		System.out.println("Enter 15 numbers");
		for(i=0;i<15;i++)
		{
			arr[i]=in.nextInt();
		}
		for(i=0;i<15;i++) {
			for(j=i;j<15;j++) {
				if(arr[i]>arr[j]) {
					k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.println("Sorted Numbers");
		for(i=0;i<15;i++) {
			System.out.print(arr[i]+" ");
		}
		in.close();
	}

}
