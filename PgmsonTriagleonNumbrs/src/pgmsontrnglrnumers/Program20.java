package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		
	     for(int i=n;i>=0; i--) 
          { 
			   for (int j=i;j>=1; j--)
			   { 
				System.out.print((char)(64+j)+" "); 
			   }
		    
		System.out.println(); 
	 }
	}	
		 
		 
	}
	
