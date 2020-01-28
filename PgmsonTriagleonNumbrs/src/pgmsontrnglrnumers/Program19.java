package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program19 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	
		 for(int i=n;i>=1; i--) 
         { 
			 int k=65;
			 
		   for (int j=i;j>=1; j--)
			   {
			   System.out.print( (char) (k+n-i)+" ");
			   k++;
			}
		   System.out.println(); 
         }

	}

}
