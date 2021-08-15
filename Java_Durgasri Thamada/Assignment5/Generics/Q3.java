package AS5.Generics;

import java.util.*;

public class Q3 {
public static <T> void swapElements(int n, int m, T[] l) {
	T temp=l[n];
	l[n]=l[m];
	l[m]=temp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Integer l[]= {2,23,4,12,8,40,41};
		for(int i=0;i<l.length;i++) {
			System.out.print(l[i]+" ");
		}
		System.out.println();
		System.out.println("After swapping 3rd and 6th positions:");
		swapElements(2,5,l);
		for(int i=0;i<l.length;i++) {
			System.out.print(l[i]+" ");
		}
		System.out.println();
		Double m[]= {3.3,4.3,5.1,99.0,4.6,2.34,23.12};
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println();
		System.out.println("After swapping 3rd and 6th positions:");
		swapElements(2,5,m);
		for(int i=0;i<m.length;i++) {
			System.out.print(m[i]+" ");
		}
	}

}
