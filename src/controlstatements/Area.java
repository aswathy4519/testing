package controlstatements;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area ob=new Area();
		ob.circle();
		System.out.println("area of triangle = "+ob.triangle(0.5, 20, 30));
		int rec=ob.rectangle();
		System.out.println(" area of rectangle ="+rec);
		ob.square(25);
		

	}
	//1.Area of circle using withroutreturntype and withoutparameter
	
		public void circle()
		{ 
			double pi=3.14,r=2.9;
		double area=pi*r*r;
		System.out.println("area of circle ="+area);
		}
	//2.Area of triangle using withreturntype and withparametre
		public double triangle(double ha,int b,int h)
		{
			double area=ha*b*h;
			return area;
		}
		//3.Area of rectangle with returntype and without parametr
		
			public int rectangle()
			{
			int l=20;
			int b=30;
			int area =l*b;
			return area;
		}
			//4.Area of square without returntype and with parameter
			public void square (int a) 
			{
				int area=a*a;
				System.out.println("area of square ="+area);
			
			}
			
}


