/*  1
   234
  56789
 1234567
891234567*/
package pgmsonspcandstrs;

import java.util.Scanner;

public class Diffnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int k=0;
	      for(int i=1;i<=n ;i++) 
          { 
			for (int j=1;j<=n-i;j++)
			    { 
				 System.out.print(" "); 
				} 
			    for (int j=1;j<=2*i-1;j++)
			    { 
				System.out.print(k%9+1);
				k++;
			    }	
		 
		        System.out.println(); 
          }
	}

}
