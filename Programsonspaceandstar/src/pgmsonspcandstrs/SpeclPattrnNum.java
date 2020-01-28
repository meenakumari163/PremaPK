/*  1
   212
  32123
 4321234
543212345
*/
package pgmsonspcandstrs;

import java.util.Scanner;

public class SpeclPattrnNum {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();

	      for(int i=1;i<=n ;i++) 
          { 
			for (int j=1;j<=n-i;j++)
			    { 
				 System.out.print(" "); 
				} 
	    	 int k=0;
			   for (int j=1;j<=2*i-1; j++)
			   { 
				System.out.print(k+i); 
				if(j<=(2*i-1)/2) {
					k--;
				}
				else {
					
					k++;
				}
			   }	
		 
		        System.out.println();
          }
	}

}
