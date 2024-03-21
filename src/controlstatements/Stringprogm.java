package controlstatements;

public class Stringprogm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		String s1="welcome";
		String s2="HELLO";
		String s3=" hello welcome to luminar";
		//1.concate
		
	System.out.println(s+s1)	;
	System.out.println(s.concat(s1));
		//System.out.println(1+3+s+5+6);// 4hello56 because addition will only work before string not after strinng..for this reason it is not 4hello11 and 13hello11	
//2.equals
		System.out.println(s.equals(s1));// hello!0 welcome
		System.out.println(s.equals(s2));// hello=hello
		System.out.println(s.equals(s3));//hello!=Hello becs case sensitive
		System.out.println(s.equalsIgnoreCase(s3)); //hello=Hello,no case sensitive
		//3.startswith
		System.out.println(s3.startsWith ("hello"));
		System.out.println(s3.endsWith("luminar"));
		//3.trim
		System.out.println(s3);
		System.out.println(s3.trim());
		//4.contains
		System.out.println(s3.contains("welcome"));//case sensitive welcome !=Welcome
		//5.length
		System.out.println(s2.length());
		//6.charAt()
		System.out.println(s2.charAt(0));
		//7.upperandlowercase
		System.out.println(s2.toUpperCase());
		System.out.println(s2.toLowerCase());
		//8.substring
		System.out.println(s2.substring(1, 3));
		System.out.println(s2.substring(2));
		//.split
		 String[] st=s3.split(" ");
		 for (String  str:st)
		 {
			 System.out.println(str);
		 }
		//9.replace
		 System.out.println(s3.replace(" hello", "hi"));
		
		
		
	}

}
