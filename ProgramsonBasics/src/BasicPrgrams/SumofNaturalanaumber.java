package BasicPrgrams;

import java.util.Scanner;

public class SumofNaturalanaumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int st=sc.nextInt();
		
		BasicOpn5 so= new BasicOpn5();
        int st3=so.sumofnatural(st);
	    System.out.println(st3);


	}

}
