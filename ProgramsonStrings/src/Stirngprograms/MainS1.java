package Stirngprograms;

import java.util.Scanner;

public class MainS1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		String st=sc.nextLine(); 
		
		int ac=0,vc=0,cc=0,dc=0, sch=0,uc=0, lc=0;
		 
		for (int i=0 ;i<st.length();i++ ) 
		  { 
		     char ch= st.charAt(i);
		     if(ch>=65&&ch<=90) 
		    {
	
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
			vc++;
			}
			else
			{
		    cc++;
			}
		}
	else if(ch>=97&&ch<=122)
			{
			ac++;
			lc++;
		    
	       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	       {
		   vc++;
		   }
		   else
		    {
			cc++;
			}
		}
	   else if(ch>=48&&ch<=97){
	    {
		dc++;
	    } 
	   }
	   else 
	   {
	    sch++;
	   }
	}
	    System.out.println("the numer of vowels is: "+vc);
	    System.out.println("the numer of consonnts is: "+cc);
	    System.out.println("the numer of digits is: "+dc);
	    System.out.println("the numer of alphbetes is: "+ac);
	    System.out.println("the numer of uppercse is: "+uc);
	    System.out.println("the numer of lowercase is: "+lc);

	    
	   }
	   
	  }

