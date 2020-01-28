package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		
	     for(int i=n;i>=0; i--) 
          { 
	    	 int k=97;
			   for (int j=0;j<=i; j++)
			   { 
				System.out.print((char)(k)+" ");
				
			   }
		    k++;
		System.out.println(); 
	 }
	}

}
