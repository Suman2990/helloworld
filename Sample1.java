package java_programs;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); //input 
		int k=1;
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k++;
				if(k>=a)  //if k is greater than the input , initialize the k to 1
				{
					k=1;
				}
			}
			System.out.println();
		}

	}

}
