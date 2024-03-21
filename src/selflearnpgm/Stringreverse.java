package selflearnpgm;

public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String name="Malayalam";

String rev="";
for (int i=name.length()-1;i>=0;i--)
{
	rev=rev+name.charAt(i);
}
System.out.println(rev);
if (name.equalsIgnoreCase(rev))
{
	System.out.println("paliandrone");
}
else
{
	System.out.println("not paliandrone");
}

String name1="parabola";
char[] n=name1.toCharArray();
System.out.println(n.length);
String reverse="";

for (int i=n.length-1;i>=0;i--)
{
reverse=reverse+name1.charAt(i);}
System.out.println(reverse);

//reverse number

int number=12345;
int temp=number;

int reverc=0;
while(number!=0)
{
	int rem=number%10;
	reverc=reverc*10+rem;
	 number=number/10;	

System.out.println("revers of"+temp+"="+reverc);
}
	}

}
