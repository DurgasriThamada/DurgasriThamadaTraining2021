package AS4.ExceptionHandling;

import java.util.Scanner;

class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String message) {
		super(message);
	}
	
}
class IllegalBankTransactionException extends Exception{

	public IllegalBankTransactionException(String message) {
		super(message);
	}

}
class SavingAccount{
	private long id;
	private double balance;
	public SavingAccount(long id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	public double withdraw(double amount) throws IllegalBankTransactionException, InsufficientBalanceException{
			if(amount>this.balance || amount==0) {
				throw new InsufficientBalanceException("Insufficient Balance");
			}else if(amount<0){
				throw new IllegalBankTransactionException("Invalid amount");
			}
			else {
				this.balance=this.balance-amount;
			}
		return this.balance;
	}
	public double deposit(double amount) {
		this.balance=this.balance+amount;
		return this.balance;
	}
}

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		SavingAccount acc=new SavingAccount(1,10000.2);
		System.out.println("Enter the amount to deposit");
		double depositAmount=in.nextDouble();
		System.out.println("Balance is "+acc.deposit(depositAmount));
		System.out.println("Enter the amount to withdraw");
		double withdraw=in.nextDouble();
		try {
			System.out.println("Balance is "+acc.withdraw(withdraw));
		} catch (IllegalBankTransactionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
