package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		
	     for(int i=1;i<=n; i++) 
          { 
	    	 int k=i;
			   for (int j=1;j<=i; j++)
			   { 
				System.out.print(k+" ");
				k=k+n-j;
			   }
		    
		System.out.println(); 
		
          
          }
		

	}

}
