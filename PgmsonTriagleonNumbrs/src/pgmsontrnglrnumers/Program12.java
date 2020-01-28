package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	
		 for(int i=n;i>=1; i--) 
         { 
			  int k=n;
			   for (int j=1;j<=i; j++)
			   { 
				System.out.print(k+" ");
				k--;
			   }
		    
		System.out.println(); 
         }

	}

}
