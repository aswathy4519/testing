package pkg;

public class Arithmaticoperators {

	public static void main(String[] args) {
		System.out.println("------Arithmatic operator---------------");
		int a = 20, b = 10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));
		System.out.println("------Assignment Operators-------");
		int c ;
		System.out.println(c=a);
		System.out.println(a+=b);
		System.out.println(a-=b);
		System.out.println("--------Relational Operator------------");
		int v1 = 40,v2 = 20;
		System.out.println(v1>v2);
		System.out.println(v1==v2);
		System.out.println("---logical operator------");
	System.out.println("Logical operator-----");
	String username="aswathy";
	String password="aswathy@123";
	System.out.println(username=="aswathy" && password=="aswathy@123");
	System.out.println(username=="aswathy" || password=="aswathy2123");
	System.out.println(!(username=="aswathy"));
	System.out.println("------unary operator----");
	int v3=10;
	System.out.println(v3++);
    System.out.println(v3);
	System.out.println(++v3);
	System.out.println("--------ternary operator--------");
	String s =v1>v2?"v1 is greater": "v2 is greater ";
	System.out.println(s);
	String k=10>15?"k greater":"k smaller";
	System.out.println(k);
	
}
}
