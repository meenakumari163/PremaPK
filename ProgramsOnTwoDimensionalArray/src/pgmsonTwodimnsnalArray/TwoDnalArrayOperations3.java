package pgmsonTwodimnsnalArray;

import java.util.Scanner;

public class TwoDnalArrayOperations3 {
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
	int[] rowbiggestmat(int[][]x) {
		int i;
		int[] big=x[0];
		int b[]=new int[x.length] ;
		for ( i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x.length; j++) {
				
	            big[i] = x[i][0];
	            
	            for (int j2 = 0; j2 < x[i].length; j2++) {
	            	
	            	if(big[i]<x[i][j]) {
	            		big[i]=x[i][j];
	            		}
	                }
			
		          }
		}
	
		return big;
		}
}
