package pgmsontrnglrnumers;

import java.util.Scanner;

public class Pragram22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		
	     for(int i=1;i<=n; i++) 
          { 
			   for (int j=1;j<=i; j++)
			   { 
				System.out.print((char)(64+i)+" "); 
			   }
		    
		System.out.println(); 
	 }

	}

}
