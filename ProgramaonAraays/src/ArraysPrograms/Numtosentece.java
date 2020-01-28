package ArraysPrograms;

import java.util.Scanner;

public class Numtosentece {
	String one[]= {"", "one","two","three","four","five","six","seven","eight",
			"nine","ten","eleven","twelve","Thirteen","fourteen","fifteen","sixteen",
			"seventeen","Eighteen","Nineteen" };
	String two[]= {"","","Twenty","thirty","fourty","fifty","sixty","seventy","eighty",
			       "ninty"};
	
		 void numTOword(int n, String st) {
			 if(n<20)
			 {
				 System.out.print(one[n]);
			 }
			 else {
				 System.out.print(two[n/10]+one[n%10]);
				  }
			 if(n!=0)
			 {
				 System.out.print(st+" ");
				 
			 }
		 }
		 public static void main(String[] args) {
		Numtosentece  ns=new Numtosentece();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int no= sc.nextInt();
		ns.numTOword(no/10000000, "crore");
		ns.numTOword(no/100000%100,"lakh");
	    ns.numTOword(no/1000%100, "Thousand");
	    ns.numTOword(no/100%10, "Hundred");
	    ns.numTOword(no%100, "Hundred");
	    
	   // System.out.println(no);
		 }
		

	}


