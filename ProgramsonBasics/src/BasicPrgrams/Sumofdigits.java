package BasicPrgrams;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn4 so= new BasicOpn4();
        int st3=so.sumofint(n);
	    System.out.println(st3);

	    

	}

}
