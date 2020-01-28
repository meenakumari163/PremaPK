package BasicPrgrams;

import java.util.Scanner;

public class MiddleNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int a =sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		BasicOpn3 so= new BasicOpn3();
        int mid=so.getmiddlenumber(a,b,c);
	    System.out.println("middle value is:"+mid);

	}

}
