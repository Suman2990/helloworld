package java_programs;

import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt(); //input 
		
	
		for(int i=1;i<=7;i++)
		{
		    int k=a;  // store the input value in a int variable 
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				k--;
				if(k<1)
				{
					k=a;
				}
				
	}
			System.out.println();
		}

}
		
}
