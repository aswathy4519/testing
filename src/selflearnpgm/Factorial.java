package selflearnpgm;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=5;
	    int factorial=1;
		
		for (int i=1;i<=number;i++)
		{
			 factorial=(i*factorial);
		System.out.println(factorial);
		}
		System.out.println("factorial of "+number+" is "+factorial);
		}

}
