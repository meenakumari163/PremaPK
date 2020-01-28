package pgmsonTwodimnsnalArray;

import java.util.Scanner;

public class TwoDnalArrayOperations7<x> {
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

					void colmnreverse(int[][]x) {

						for(int i=0; i<x.length/2;i++)
						{
							for(int j=0; j<x[i].length;j++)
				               {
				            	   int t=x[i][j];
				            	  x[i][j]=x[x.length-1-i][j];
				            	  x[x.length-1-i][j]=t;
						        }
						}
					 
					}
					public void rotateleft( int x[][] ) {
						
						transpose(x);
						colmnreverse(x);
					}
}
