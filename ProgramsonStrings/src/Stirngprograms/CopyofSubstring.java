package Stirngprograms;
import java.util.Scanner;

public class CopyofSubstring {
public static void main(String[] args) {
		System.out.println("enter the main string"); 
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String st1=sc.next(); 
		char ch1[]=st1.toCharArray();
		System.out.println("enter the sub string"); 
		String st2=sc.next(); 
		char ch2[]=st2.toCharArray(); 
		int find=0; 
		for (int i=0;i<ch1.length ;i++ ) 
		{
			int k=i, j=0; 
			while (k<ch1.length && j<ch2.length && ch1[k]==ch2[j]) 
			{ 
				j++;
				k++;
				} 
			if(j==ch2.length) 
			{ 
				find++; 
				System.out.println( find+" times "+st2+" present between "+i+" to "+k+" indexs"); 
				} 
			} 
		if(find==0)
		System.out.println("not found");
		}

    }
