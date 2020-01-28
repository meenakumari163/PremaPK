package pgmsontrnglrnumers;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter  the String");
		String st=sc.nextLine();
		for(int i=0;i<st.length() ;i++) 
		{ 
			
			for ( int j=0;j<=i; j++)
			    { 
				System.out.print(st.charAt(i)+" ");
				
				} 
			System.out.println(); 
		
	     }
     }

}
