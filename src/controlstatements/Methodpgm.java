package controlstatements;

public class Methodpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodpgm ob=new Methodpgm();
		ob.add();
		int c=ob.sub();
		System.out.println(c);
		int m=ob.mult(20, 10);
		System.out.println(m);
		System.out.println(ob.mult(20, 10));
	    ob.div(40,10);
		
		
		
		
	}	
//1.method without returntype and without parameter
		public void add()
		{
		int a=20;
		int b=30;
		int c=a+b;
		System.out.println(c);
		} 
		//2.method with returntype and without parameter
		public int sub()
		{
			int a=30,b=20,c=a-b;
		return c;
		
		}
		//3.method with returntype and with parameter;
		public int mult(int a,int b)
		{
			int m=a*b;
			return m;
		}

		//4.method without returntype and with  parameter
		public void div(int a ,int b)
		{
			double c=a/b;
			System.out.println(c);
		}
	}


