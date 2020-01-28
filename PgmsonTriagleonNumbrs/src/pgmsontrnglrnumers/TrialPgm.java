package pgmsontrnglrnumers;

import java.util.Scanner;

public class TrialPgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int k=1;
	     for(int i=1;i<=n; i++) 
	      { 
			   for (int j=1;j<=i; j++)
			   { 
				System.out.print((i*2-j)+" "); 
		
			   }
		System.out.println(); 
	}
}
}