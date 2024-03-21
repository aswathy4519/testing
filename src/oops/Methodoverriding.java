package oops;
 class Father
{
	public void job()
	{
		System.out.println("welder");
		}
}
class Son extends Father
{

	@Override
	public void job() {
		System.out.println("developer");
		// TODO Auto-generated method stub
		super.job();
	}
	
} 
class Son1 extends Father
{

	@Override
	public void job() {
		System.out.println("chemist");
		// TODO Auto-generated method stub
		super.job();
	}

}

	




public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son1 ob=new Son1();
		ob.job();

	}

}
