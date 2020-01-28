package BasicPrgrams;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number"); 
		int n=sc.nextInt();
		
		BasicOpn6 so= new BasicOpn6();
        boolean st3=so.iseven(n);
	    System.out.println(st3);
	}

}
