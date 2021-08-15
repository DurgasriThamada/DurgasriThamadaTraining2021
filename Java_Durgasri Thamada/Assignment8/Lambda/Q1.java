package AS8.Lambda;

interface ArithmeticOperation{
	public void Operation(int a,int b);
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArithmeticOperation addition= (a,b)->System.out.println("Add: "+(a+b));
	    addition.Operation(10,20);
	    ArithmeticOperation subtraction= (a,b)->System.out.println("Sub: "+(a-b));
	    subtraction.Operation(10,20);
	    ArithmeticOperation multiplication= (a,b)->System.out.println("Mul: "+(a*b));
	    multiplication.Operation(10,20);
	    ArithmeticOperation division= (a,b)->System.out.println("Div: "+(a/b));
	    division.Operation(100,20);
	}

}
