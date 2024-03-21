package selflearnpgm;

public class QAfox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int number=12345;
		int num=number;
		int rev=0;
		 while(number!=0)
		 {
			 int rem=number%10;
			 rev=rev*10+rem;
			 number=number/10;	 
		 }
		 System.out.println("reverse of "+num+" is "+rev);

	
		 for (char i='A';i<='Z';i++)
		 {
			 System.out.print(i);
		 }
		 */
		// remove white spaces
		
		 String str=" java interview questions ";
		 str=str.replaceAll("\\s","");
		 System.out.println(str);
		 
	}

}
