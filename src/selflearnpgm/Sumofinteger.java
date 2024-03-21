package selflearnpgm;

public class Sumofinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /* int num=123459;
 int sum=0;
  while (num>0)
  {
	  int rem=num%10;
	  sum=sum+rem;
	  num=num/10;
  }
  System.out.println(sum); */
		
	/*	int num=12345;
		int rev=0;
		 while(num>0)
		 {
			 int rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 System.out.println(rev); */
	
	int number=12345;
	int count=0;
	while (number!=0)
	{
	 number=number/10;
	 count++;
  }
	 System.out.println(count);
	}

}
