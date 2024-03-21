package oops;

   public class Construct {
	
	/* String employee;
	int empid;
	  
	public Construct(String employee,int empid)
	{
		this.employee=employee;
		this.empid=empid;
	}
	public void display()
	{
		System.out.println("employee="+employee);
		System.out.println("empid="+empid);
	}
*/
	public static void main(String[] args)
	{
		//Construct ob=new Construct("aswathy",001);
	//	ob.display();
	//	Construct ob1=new Construct("aswathy",1);
	//ob1.view();
		Construct ob= new Construct("aswathy", 10);
	//.view();
		System.out.println(ob.id);
		System.out.println(ob.name);
		
	} 
	   
	   String name;
	   int id;
	  public Construct (String name,int id) 
	//  constructor with parameter
	   {	   
		   this.name=name;
		   this.id=id;
	   }
/*	   public Construct()
	   // constructor with no parameter/no argument constructor/default constructor
	   {
		   this.name="aswathy";
		   this.id=24;
	   } */
	   
	/*   public void view()
	   {
		   System.out.println("name="+name);
		   System.out.println("id="+id);
	   } */

}
