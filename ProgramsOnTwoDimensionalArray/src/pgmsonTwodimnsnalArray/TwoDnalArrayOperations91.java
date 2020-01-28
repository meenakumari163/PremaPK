package pgmsonTwodimnsnalArray;

import java.util.Scanner;

public class TwoDnalArrayOperations91
{
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
		public void spiralorder(int ar[][], int n) {
		
			
			for (int i=0,j=n-1; i<j; i++, j--) 
			{
				for(int k=i; k<j; k++)
				{
					System.out.println(ar[i][k]+" ");
				}
				for(int k=i; k<j; k++)
				{
					System.out.println(ar[k][j]+" ");
				}
					
				for(int k=j; k>j; k--)
				{
					System.out.println(ar[j][k]+" ");
				}
				for(int k=j; k>j; k--)
				{
					System.out.println(ar[k][i]+" ");
				}
				
			}
			
		if(n%2==1)
			System.out.println(ar[n/2][n/2]);
			
		
       }
			
			
		}
