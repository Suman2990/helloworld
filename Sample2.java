package java_programs;

import java.util.Scanner;

public class Sample2 {

	public static void main(String[] args) {
		/*Scanner s=new Scanner(System.in);
		int a=s.nextInt(); //input not needed */
		int k=0;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
				if(k>1)
				{
					k=0;
				}
			}
			System.out.println();
	}

}
}
