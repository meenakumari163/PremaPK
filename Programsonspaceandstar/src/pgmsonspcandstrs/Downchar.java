/*  ABCDEFGHI
     ABCDEFG
      ABCDE
       ABC
        A   */
package pgmsonspcandstrs;
import java.util.Scanner;

public class Downchar {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	      for(int i=n;i>=1 ;i--) 
          { 
			for (int j=1;j<=n-i;j++)
			    { 
				 System.out.print(" "); 
				} 
			    for (int j=1;j<=(2*i)-1;j++)
			    { 
				System.out.print((char)(65+j-1)); 
			    }	
		 
		        System.out.println(); 
          }

	}

}
