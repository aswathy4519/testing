package prob;

public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="hi welcome to home";
String[] b=a.split("\\s");
int count=0;
for ( String c:b)
{
	count++;
}
System.out.println(count);

	}

}
