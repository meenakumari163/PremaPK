/*      1

      1 * 2

    1 * 2 * 3

  1 * 2 * 3 * 4

1 * 2 * 3 * 4 * 5          */
package pgmsonspcandstrs;
import java.util.Scanner;
 
public class UpperNumwithstar {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();
		int k=1;
	      for(int i=1;i<=n ;i++) 
          { 
			for (int j=1;j<=n-i;j++)
			    { 
				 System.out.print("  "); 
				} 
			    for (int j=1;j<=i;j++)
			    { 
				
				if(j<i)
				{
                 System.out.print(j+" * ");
				 }
				  else
				  {
				  System.out.println(j);
				   }
				 }	
		     System.out.println(); 
          }
	}

}
