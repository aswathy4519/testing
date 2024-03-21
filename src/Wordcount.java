
public class Wordcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ch="Hi welcome to home";
 int count=0;
//String[] words=ch.split("\\s+");
 String[] wd=new String[1];
 wd=ch.split("\\s");
for (String n:wd)
{
	count++;
}
System.out.println(count);

	}

}
