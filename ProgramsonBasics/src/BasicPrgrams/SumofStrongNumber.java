package BasicPrgrams;

import java.util.Scanner;

public class SumofStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range"); 
		int n=sc.nextInt();
		int count=0;
		
		BasicOpn13 so= new BasicOpn13();
		for (int i = 0; i <n; i++)
		{
			 boolean st3 = so.isstrong(i);	
		
	     if (st3) {
	    	count++;
	    }
		}
	   System.out.println("number of strong number between 1 to " + n +" is "+count); 
	   
	   //sum of strong number between 1 to n
	   int sum=0;
	   for(int i=0;i<=n; i++)
	   {
		   
		   boolean rs = so.isstrong(i);
		   if(rs) {
			  sum=sum+i;
		   }
	   }
		   System.out.println("sum of strong number between i to "+n+" is "+sum);
	}
}