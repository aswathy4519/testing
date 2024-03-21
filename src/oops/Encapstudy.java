package oops;

public class Encapstudy {
	
	private String Stname;
	private int Stid;
	
	public String  getStname()
	{
		return Stname;
	}
	
	public void setStname(String name)
	{
		this.Stname=name;
		
	}
	public void setStid(int Stid )
	{
		this.Stid=Stid;
	}
	public int getStid()
	{
		return Stid;
	}

	 
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Encapstudy ob=new Encapstudy();
ob.setStname("aswathy sabu");
System.out.println(ob.getStname());
ob.setStid(001);
System.out.println(ob.getStid());


	}

}
