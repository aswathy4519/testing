package oops;

import java.util.Scanner;

interface Bank
{
	void acountdetails();
	void balance();
	void withdraw();
	void deposit();
}
class Federalbank implements Bank
{
Scanner sc= new Scanner(System.in);

 int balance=1000;
	@Override
	public void acountdetails() {
		// TODO Auto-generated method stub
		System.out.println(" your bank account details");
		System.out.println("enter your name");
String name=sc.nextLine();
System.out.println(name);
System.out.println(" enter account number");
Long accountnumber=sc.nextLong();
System.out.println(accountnumber);
	}

	@Override
	public void balance() {
		
		
		System.out.println( " your account balance ");
		
		System.out.println(balance)	;
	}

	@Override
	public void withdraw() {
		System.out.println(" your balance");
		System.out.println(" enter withdrawal amount");	
		int withdrawamount=sc.nextInt();	
		if (balance>withdrawamount)
		{
			balance=balance-withdrawamount;
			System.out.println(withdrawamount+"withdrawn");
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}

	@Override
	public void deposit() {
		System.out.println(" your deposit amount");
		int depositamount=sc.nextInt();
		System.out.println("enter amount to deposit");
		balance=balance+depositamount;
		System.out.println(" your current balance="+balance);
	}	
}
public class Bankapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Federalbank ob=new Federalbank();

ob.acountdetails();
ob.balance();
ob.withdraw();
ob.deposit();


	}
}
	
	

