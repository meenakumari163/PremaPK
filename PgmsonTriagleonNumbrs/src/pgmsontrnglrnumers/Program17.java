package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n ;i++) 
		{ 
			 int k= 97;
			for ( int j=0;j<=i; j++)
			    { 
				System.out.print( (char) (k+i)+" "); 
				} 
			System.out.println(); 
			}
	}
}
