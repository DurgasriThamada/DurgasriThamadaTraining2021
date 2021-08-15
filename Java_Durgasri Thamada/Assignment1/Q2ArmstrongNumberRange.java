
public class Q2ArmstrongNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum,rem,i,k;
		for(i=100;i<=999;i++) {
			k=i;
			sum=0;
			while(k!=0) {
				rem=k%10;
				sum+=(rem*rem*rem);
				k=k/10;
			}
			if(i==sum) {
				System.out.print(i+" ");
			}
		}
		System.out.println("are the Armstrong numbers in the range of 100-999");
	}

}
