package newpackage;

import java.util.Scanner;

public class BinarytoDecimal {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the number"); 
		    long n=sc.nextLong();
		    long dec=0;
		    int count=0;
		    while(n>0) {
		    	long r=n%10;
		    	dec=dec+r*pow(2,count);
		    	count++;
		    	n/=10;
		    }
		    	System.out.println("decimal equivalent:"+dec);
		    	
		    }
		    
	
		   static int pow(int n, int p) 
		    {
		       int pw=1; 
		      while(p>0) { 
		      pw=pw*n;
		      p--; 
		    } 
		    return pw;
		    	    
	}

}
