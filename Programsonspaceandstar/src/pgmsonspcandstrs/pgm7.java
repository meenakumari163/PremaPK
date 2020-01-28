/*   123456
      23456
       3456
        456
         56
          6   */
package pgmsonspcandstrs;
import java.util.Scanner;

public class pgm7 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	      for(int i=0;i<=n ;i++) 
          { 
			for (int j=1;j<=i;j++)
			    { 
				 System.out.print(" "); 
				} 
			    for (int j=1;j<=n-i+1;j++)
			    { 
				System.out.print(j+i); 
			    }	
		 
		        System.out.println(); 
          }
	   }
}
