package BasicPrgrams;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn8 so= new BasicOpn8();
        int st3=so.revesre(n);
	    System.out.println(st3);
	}

}
