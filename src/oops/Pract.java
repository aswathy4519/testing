package oops;
class Member2
{
	String name;
	int age;
	long phonenumber;
	String address;
	int salary;
/*	 public void printdetails()
	 {
		 System.out.println("name="+name);
		 System.out.println("age="+age);
		 System.out.println("phonenumber="+phonenumber);
		 System.out.println("salary="+salary);} */
}
class Employee1 extends Member2
{
	String specialization;
}
class Manager2 extends Member2
{
	String department;
}

public class Pract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Manager2 ob=new Manager2();
String n =ob.name="aswathy";

System.out.println(n);
 String b =ob.department="qa";
System.out.println(b);
 

//Employee1 obj=new Employee1();
// String s=obj.specialization="automation";
//System.out.println("specialization="+s);
	}

}
