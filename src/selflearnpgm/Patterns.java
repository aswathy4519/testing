package selflearnpgm;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=6;i>=1;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		int count=1;
		while(count<=15)
		{
			System.out.println(count%2==1? "***":"+++++");
			++count;
		}
		int g=3;
		System.out.println(++g*8);

		
		
	}

}
