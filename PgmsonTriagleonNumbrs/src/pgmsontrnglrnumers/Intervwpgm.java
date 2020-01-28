package pgmsontrnglrnumers;

import java.util.Scanner;

public class Intervwpgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();
		
	     for(int i=1;i<=n; i++)
          { 
	    	 int k=1;
			   for (int j=1;j<=2*i-1; j++)
			   { 
				System.out.print(k+ " "); 
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
