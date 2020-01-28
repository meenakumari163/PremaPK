package BasicPrgrams;

import java.util.Scanner;

public class Countdigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int st=sc.nextInt();
		
		BasicOpn2 so= new BasicOpn2();
        int st3=so.getcountofnumber(st);
	    System.out.println(st3);


	}

}
