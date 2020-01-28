package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		
	     for(int i=n;i>=0; i--) 
          { 
	    	 int k=97;
			   for (int j=i;j>=0; j--)
			   { 
				System.out.print((char)(k+n+j)+" ");
				
			   }
          System.out.println();   
          }
	}

}
