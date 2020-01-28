package pgmsonTwodimnsnalArray;

import java.util.Scanner;

public class TwoDnalArrayOperations8 {
	public int[][] readmat(){
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the row and columns");
		int r= sc.nextInt();
		int c = sc.nextInt();
		int mat[][]=new int[r][c];
		for (int i = 0; i < mat.length; i++) {
			System.out.println("enter"+ (i+1)+"row elements");
			for (int j = 0; j < mat.length; j++)
			{
				
		      mat[i][j]	=sc.nextInt();
			}
		}
		
		return mat;
	}
	void dispmat(int[][]x) {
		for (int i = 0; i<x.length; i++) 
		{
			for (int j = 0; j<x[i].length; j++)
			{
				System.out.print(x[i][j]+" ");
			}
		
			System.out.println();
		}
	}
		void transpose(int a[][]) {

			for(int i=0; i<a.length; i++)
			{
				for(int j=i+1; j<a[i].length; j++)
	               {
	            	  int t=a[i][j];
	            	  a[i][j]=a[j][i];
	            	  a[j][i]=t;
					
				   }
			}
		}

				
	void rowreverse(int[][]x) 
	{

					for(int i=0; i<x.length;i++)
					{
						for(int j=0; j<=x[i].length/2;j++)
			               {
			            	   int t=x[i][j];
			            	  x[i][j]=x[i][x[i].length-1-j];
			            	  x[i][x[i].length-1-j]=t;
							
						
					        }
					}
		}
				public void rotateright( int x[][] ) 
				{
					
					transpose(x);
					rowreverse(x);
				}
}

