package selflearnpgm;

import java.util.Scanner;

public class Amstrongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		
		int numb=sc.nextInt();
		int number=numb;
		int cube=0;
		while(numb!=0)
		{
			int rem=numb%10;
			 cube=cube+(rem*rem*rem);
			 numb=numb/10;
		}
		if (cube==number)
		{
			System.out.println(cube+" is amstrong number");
		}
		else
		{
			System.out.println(cube+" not amstrong number");
		}

	}

}
