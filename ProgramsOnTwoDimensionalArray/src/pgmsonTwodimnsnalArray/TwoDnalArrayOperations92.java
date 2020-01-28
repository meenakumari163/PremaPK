package pgmsonTwodimnsnalArray;

import java.util.Scanner;

public class TwoDnalArrayOperations92 {
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

	public int[][] matrixmul(int a[][] , int b[][])
	{
	//if(a.length!=b[0].length||a[0].length!=b.length)
	//{
		//System.out.println( "not matched");
		//return null;
		//}
	int p[][]=new int [a.length][b.length];
	
	for (int i= 0; i<a.length; i++)
	{
		for (int j=0; j<b[i].length; j++)
		{
			for (int k=0; k<b.length; k++) 
			{
				p[i][j]= p[i][j]+a[i][k]*b[k][j];
			}
		}
	}
	return p;
	}
}
