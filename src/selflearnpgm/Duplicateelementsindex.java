package selflearnpgm;

import java.util.HashSet;

public class Duplicateelementsindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {3,4,5,3,6,4};
			for (int i=0;i<=a.length-1;i++)
		{
			for (int j=i+1;j<=a.length-1;j++)
			{
				if (a[i]==a[j])
				{
					System.out.println(a[i]+" is duplicated");
				}
				
			}
		}
		// using hashset
			int [] b= {3,4,5,3,6,4};
			HashSet<Integer> hset=new HashSet<Integer>();
			for (int i=0;i<b.length;i++)
			{
				if (hset.add(b[i])==false)
				{
					System.out.println(b[i]+" is duplicated");
				}
			}

	}

}
