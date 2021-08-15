import java.util.*;
public class Q9TotalAverageOfMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int m1[]=new int[3];
		int m2[]=new int[3];
		int m3[]=new int[3];
		int totSub[]=new int[3];
		int totStu[]=new int[3];
		double avgstu[]=new double[3];
		double avgSub[]=new double[3];
		int i=0;
		System.out.println("Enter the marks of 1st student");
		for(i=0;i<3;i++) {
			m1[i]=in.nextInt();
			totStu[0]+=m1[i];
		}
		System.out.println("Enter the marks of 2nd student");
		for(i=0;i<3;i++) {
			m2[i]=in.nextInt();
			totStu[1]+=m2[i];
		}
		System.out.println("Enter the marks of 3rd student");
		for(i=0;i<3;i++) {
			m3[i]=in.nextInt();
			totStu[2]+=m3[i];
		}
		for(i=0;i<3;i++) {
			totSub[i]=m1[i]+m2[i]+m3[i];
		}
		for(i=0;i<3;i++) {
			avgSub[i]=totSub[i]/3;
		}
		for(i=0;i<3;i++) {
			avgstu[i]=totStu[i]/3;
		}
		System.out.println("Total and Average marks of 1st Student are "+totStu[0]+" and "+avgstu[0]);
		System.out.println("Total and Average marks of 2nd Student are "+totStu[1]+" and "+avgstu[1]);
		System.out.println("Total and Average marks of 3rd Student are "+totStu[2]+" and "+avgstu[2]);
		System.out.println("Total and Average marks of 1st Subject are "+totSub[0]+" and "+avgSub[0]);
		System.out.println("Total and Average marks of 2nd Subject are "+totSub[1]+" and "+avgSub[1]);
		System.out.println("Total and Average marks of 3rd Subject are "+totSub[2]+" and "+avgSub[2]);
		in.close();
	}

}
