package java_programs;

import java.util.Scanner;

public class Sample3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); //input 
		//int k=0;
		int n=5;
		for(int i=0;i<5;i++)
		{
			for(int j=1;j<n-i-1;j++) //
			{
				System.out.print(" ");
			
			}
			for(int k=0;k<=2*i;k++)
			{
				System.out.print(k);
			
			}
			System.out.println();
			

	}

}
}