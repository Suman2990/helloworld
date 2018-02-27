package java_programs;

import java1.Sample34;

//leftshift90

public class leftshift90 {
	public static void transpose(int[][] in)
	{
      
		
		int cnt=in.length;
		int c=0;
		
		for(int i=0;i<cnt;i++)
		{
		for(int j=i+1;j<in[i].length;j++)
		{
			if(i!=j) //i= & j=1
			{
			int temp=in[i][j];
			in[i][j]=in[j][i];	
			in[j][i]=temp;
		}	
			
		
	}
		}
	}
		
		
	public static void main(String[] args) {
		int[][] in={{1,2,3},{4,5,6},{7,8,9}};
		 int cnt=in.length;
		 for(int a=0;a<cnt;a++)
		 {
			 for(int b=0;b<cnt;b++)
			 {
				 System.out.print(in[a][b]+" ");
			 }
			 System.out.println();
		 }
		 System.out.println("&&&&");
		 leftshift90.transpose(in);    //transpose
		
		 for(int a=0;a<cnt;a++)
		 {
			 for(int b=0;b<cnt;b++)
			 {
				 System.out.print(in[a][b]+" ");
			 }
			 System.out.println();
		 }
		 
		   int[][] k=new int[in.length][in.length];          // storing the transpose matrix in another 2d array 
			for(int i=0;i<cnt;i++) 
			{
			for(int j=0;j<cnt;j++)
			{
				k[i][j]=in[i][j];
			}
		}
			
		
		
		//rows swap 
		int k1=in.length-1;
		for(int i=0;i<in.length/2;i++)
		{
			for(int j=0;j<in.length;j++)
			{
				int temp=k[j][i];
				k[j][i]=k[j][k1];
				k[j][k1]=temp;
			
			}
			System.out.println();
		}
		System.out.println("&&&&&&");
		for(int i=0;i<in.length;i++)
		{
			for(int j=0;j<in.length;j++)
			{
				System.out.print(k[i][j]+" ");
			}
			System.out.println();
		}
		
    
	}

}
