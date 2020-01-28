/* 1 
   1 2 1 
   1 2 3 2 1 
   1 2 3 4 3 2 1 
   1 2 3 4 5 4 3 2 1  */
package pgmsontrnglrnumers;
import java.util.Scanner;

public class Program21 {
public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();
		
	     for(int i=1;i<=n; i++)
          { 
	    	 int k=1;
			   for (int j=1;j<=2*i-1; j++)
			   { 
				System.out.print(k+" "); 
				if(j<=(2*i-1)/2) {
					k++;
				}
				else {
					
					k--;
				}
			   }
		    
		System.out.println(); 
		
       }
	     
	}
}
