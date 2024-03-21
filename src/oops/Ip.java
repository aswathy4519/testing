package oops;
class  Member1
{
public	String name;
	int age;
	long phonenumber;
	String address;
	
	
	public void printdetails()
	{
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("phonenumber:"+phonenumber);
		System.out.println("address:"+address);
	}
	}
class  employee extends Member1
{
	String specialization;
	
	
}
class manager extends Member1
{
	String department;
}

public class Ip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
manager ob=new manager();
ob.name="aswathy";
ob.printdetails();
	}

}
