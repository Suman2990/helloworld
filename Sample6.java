package java_programs;

import java.util.Scanner;

public class Sample6 {
	public static void test()
	{
		
		int star1=5;
		  
		  int space1=1;
			for(int i1=1;i1<=3;i1++)
			{
				for(int k=1;k<=space1;k++)
				{
					System.out.print(" ");
				}
				int k11=1;
				for(int j=1;j<=star1;j++)
				{
					System.out.print(k11);
					k11++;
		}
				star1=star1-2;
				space1++;
				System.out.println();

	}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); //input not needed
		int star=1;
	  
	  int space=3;
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			int k1=1;
			for(int j=1;j<=star;j++)
			{
				System.out.print(k1);
				k1++;
	}
			star=star+2;
			space--;
			System.out.println();

}
		Sample6.test();
	}
}
