package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program11 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
	    System.out.println("enter value of n");
	     int n=sc.nextInt(); 
	     int k=1;
	     for(int i=n;i>=1 ;i--) 
			{ 
				
				for ( int j=1;j<=i; j++)
				    { 
					System.out.print(k+" ");
					k++;
					if(k==10)
						k=1;
					} 
				System.out.println(); 
			}
	}

}
