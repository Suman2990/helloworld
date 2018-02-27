package java_programs;

public class Sample4 {

	public static void main(String[] args) {
		int space=4;
		int star=1;
	
		
	
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=star;k>=1;k--)
			{
				System.out.print(k);
			}
			star=star+2;
			space--;
			System.out.println();
				
	}

}
	}
