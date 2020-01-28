
/*E D C B A 
  D C B A 
  C B A 
  B A 
  A */
package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		
	     for(int i=n;i>=0; i--) 
          { 
			   for (int j=i;j>=1; j--)
			   { 
				System.out.print((char)(64+i)+" "); 
			   }
		    
		System.out.println(); 

	}

}
}