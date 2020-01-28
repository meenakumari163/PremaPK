package newpackage;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		   System.out.println("enter the number"); 
		    int num=sc.nextInt();
		    int t=num; 
		    int rev=0; 
		    while(num!=0) 
		{ 
			rev = rev*10+(num%10); 
			num = num/10;
			}
		if(rev==t) 
		{
			System.out.println(t+" is a palindrome");
		}
		else {
			System.out.println(t+" is  nota palindrome");
			
		}    
		    


	}

}
