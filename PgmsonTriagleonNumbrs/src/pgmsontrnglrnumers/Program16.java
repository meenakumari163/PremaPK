package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
     
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int k= 97;
		
		for(int i=1;i<=n ;i++) 
		{ 
			
			for ( int j=1;j<=i; j++)
			    { 
				System.out.print( (char) (k)+" ");
				k++;
				if(k==123)
					k=97;
				} 
			System.out.println(); 
		
		}

	}

}
