package Stirngprograms;

import java.util.Scanner;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0; 
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in); 
		System.out.println("Enter a string:.........."); 
		String st=scn.nextLine(); 
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			if(ch[i]>=65&&ch[i]<=90 ||ch[i]>=97 && ch[i]<=122||
					ch[i]>=48&&ch[i]<=57 && ch[i]!=32 && ch[i]!=',' &&ch[i]!='.') 
				count++; 
			} 
		System.out.println("No of Characters="+count); 
	}
	
}

