package oops;

public class Exceptn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int a=10,b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("hello");
	
		try 
		{
	        String s=null;
	        System.out.println(s.length());
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("hello");
		
	
	}
}
