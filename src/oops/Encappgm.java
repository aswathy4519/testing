package oops;
class Empdetails3
{
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
}


public class Encappgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empdetails3 ob= new Empdetails3();
ob.setEmpname("Aswathy sabu");
ob.setEmpid(001);
System.out.println("name:"+ob.getEmpname());
System.out.println("empid:"+ob.getEmpid());

}

}
