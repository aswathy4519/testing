package selflearnpgm;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("eneter a number to get fibinocci series upto that");
		int z=sc.nextInt();
		System.out.println(z);
		
		int a=1;
		int b=1;
	    int f=0;
	    System.out.print(a+" ");
	    System.out.print(b+" ");
	    
	    while (f<=z)
	    {
	    	f = a+b;
	    	if (f>=z)
	        break;
	    	System.out.print(f+" ");
	    	
	    	a=b;
	    	b=f;
	    }
				
}

}
