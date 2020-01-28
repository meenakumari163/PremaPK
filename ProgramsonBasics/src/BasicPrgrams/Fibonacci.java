package BasicPrgrams;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number"); 
	int n=sc.nextInt();
	
	BasicOpn10 so= new BasicOpn10();
    int st3=so.fibonacci(n);
    System.out.println(st3);
	}

}
