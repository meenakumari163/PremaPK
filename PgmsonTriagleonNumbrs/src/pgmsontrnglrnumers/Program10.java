package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
	    System.out.println("enter value of n");
	     int n=sc.nextInt(); 
	     int k=1;
	     for(int i=n;i>=1; i--) 
	     { 
		   for (int j=1;j<=i; j++)
		   { 
			   if(j%2==0)
			      {
				 System.out.print("0"+" ");
				  } 
			      else 
			      {
			    	  System.out.print("1"+" ");
			      }
			  }   	  
	       System.out.println(); 
	     }

	}

}
