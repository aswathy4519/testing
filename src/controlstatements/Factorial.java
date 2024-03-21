package controlstatements;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int n = 5;
	//	int f = 1;
	//	for ( int i=1;i<=n;i++)
	//	{System.out.println(f);
		//	System.out.println("factorial = "+f);
		//}
		//int n=5;
//int f=1;
		//	for ( int i=1;i<=n;i++)
				//{
			//	f=f*i;
			//	System.out.println(f);
			//	}
		//		System.out.println("factorial=" +f);
	//}

		int f=1;
				int n=5;
			for ( int i=1;i<=5;i++)
				{
				f=(f*i);
				System.out.println(f);
								}
			System.out.println("factorial of 5="+f);
	/*	int factorial=1;
		for (int i=1;i<=5;i++)
		{
		factorial=(i*factorial);
		System.out.println(factorial);	}
		System.out.println("5 factorial="+factorial); */
		int n1=5;
		int factorial=1;
		
		for (int i=1;i<=5;i++)
		{
		factorial =( factorial*i	);
		System.out.println(factorial);
		}
		
		System.out.println("factorial of 5="+factorial);

	}
}

