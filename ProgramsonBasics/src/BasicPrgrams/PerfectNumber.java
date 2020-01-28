package BasicPrgrams;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn11 so= new BasicOpn11();
	    boolean st3=so.isperfect(n);
	    System.out.println(st3);

	}

}
