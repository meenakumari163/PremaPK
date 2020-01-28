package BasicPrgrams;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn14 so= new BasicOpn14();
        boolean st3=so.ishappy(n);
	    System.out.println(st3);

	}

}
