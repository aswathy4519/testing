package controlstatements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int choice=3;
		//switch (choice)
		//{
		//	case 1 : System.out.println("monday");
		//	break;
		//	case 2 : System.out.println("tuesday");
		//	break;
		//	case 3 : System.out.println("wednesday");
		//	break;
		//	case 4 : System.out.println("thursday");
		//	break;
		//	case 5 : System.out.println("friday");
			//break;
		//	case 6 : System.out.println("saturday");
		//	break;
		//	case 7 : System.out.println("sunday");
		//	break;
			//default:System.out.println("invalid choice");
			
		//}
	/*	int option=9;
		switch (option)
		{
		case 1:System.out.println("accepted1");
		break;
		case 2:System.out.println("accepted2");
		break;
		case 3:System.out.println("accepted3");
		break;
		case 4:System.out.println("accepted4");
		break;
		case 5:System.out.println("accepted5");
		break;
		case 6:System.out.println("accepted6");
		break;
		case 7:System.out.println("accepted7");
		break;
		default:System.out.println("invalid option");*/
		
		/*int weeks =7 ;
		switch (weeks)
		{
			case 1:System.out.println("sunday");
			break;
			case 2:System.out.println("monday");
			break;
			
			case 3:System.out.println("tueday");
			break;
			case 4:System.out.println("wenday");
			break;
			case 5:System.out.println("thurday");
			break;
			
			case 6:System.out.println("friday");
			break;
			case 7 :System.out.println("satday");
			break;
			default:System.out.println("invalid");
		}*/
			
	 /*	System.out.println("calculator");
		Scanner calc=new Scanner(System.in);
		System.out.println("enter a digit");
		int a =calc.nextInt();
		System.out.println("enter a digit");
		int b=calc.nextInt();
		System.out.println("enter operations :+,-,*,/");
		char c =calc.next().charAt(0);
		switch (c)
		{
		case '+':System.out.println(+(a+b));
		break;
		case '-':System.out.println(+(a-b));
		break;
		case '*':System.out.println(+(a*b));
		break;
		case '/':System.out.println(+(a/b));
		break;
		default :System.out.println("invalid combination");
		}
		 */
	Scanner sc=new Scanner(System.in);
	System.out.println(" calculator");
	System.out.println("enter a digit");
	int a=sc.nextInt();
	System.out.println("enter a digit");
	int b=sc.nextInt();
	System.out.println(a);
	System.out.println(b);
	System.out.println(" enter operations +,-,*,/");
	char c=sc.next().charAt(0);
		switch (c)
		{
		case '+':System.out.println((a+b));
		break;
		case '-':System.out.println((a-b));
		break;
		case '*':System.out.println((a*b));
		break;
		case '/':System.out.println((a/b));
	    break;
		default:System.out.println(" invalid opeartins");
		}
		
		
		
		
		

	}

}
