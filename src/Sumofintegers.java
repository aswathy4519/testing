
public class Sumofintegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=12345;
 Sumofintegers ob=new Sumofintegers();
ob.Sumofdigits(number);


	}
	public void Sumofdigits(int number)
	{
 int sum=0;
while (number>0)
{
	int digit =number%10;
	 sum=digit+sum;
	 number=number/10;
}
// System.out.println(sum);

	}

}
