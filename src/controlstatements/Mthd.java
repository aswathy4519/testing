package controlstatements;

public class Mthd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mthd a=new Mthd();
		a.method();
	 int c1=a.sub();
		System.out.println(c1);
		 int c2=a.mult(10, 20);
		System.out.println(c2);
		 int k=a.div(100, 10);
		System.out.println(k);

	}
// withoutreturntype and parametre
	public  void method()
	{ int a=20,b=30,c;
	c=a+b;
	System.out.println(c);
		
	} 
	// with returntype and without parametr
	public int sub()
	{
		int a=30,b=10,c;
		c=a-b;
		return c;
	
	}
	//with return type and parametr
	public int mult(int a,int b)
	{
		int c=a*b;
		return c;
	}
	//with return and with para
	public  int div (int e,int f)
	{
		int g=e/f;
		return g;
		
	}
}
