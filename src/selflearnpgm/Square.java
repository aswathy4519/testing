package selflearnpgm;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number you want to check its square");
		 int number=sc.nextInt();
		 System.out.println("square of " +number+ " is " + (number*number));
		 
		 //cube
		 System.out.println("cube of " +number+ " is " + (number*number*number));

	}

}
