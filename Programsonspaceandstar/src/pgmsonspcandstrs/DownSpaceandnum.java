/*   12345
      1234
       123
        12
         1   */
package pgmsonspcandstrs;
import java.util.Scanner;

public class DownSpaceandnum {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	      for(int i=1;i<=n ;i++) 
          { 
			for (int j=1;j<=i;j++)
			    { 
				 System.out.print(" "); 
				} 
			    for (int j=1;j<=n-i+1;j++)
			    { 
				System.out.print(j); 
			    }	
		 
		        System.out.println(); 
          }
	 }
}