package BasicPrgrams;

import java.util.Scanner;



public class Specialnum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string"); 
		int st=sc.nextInt();
		
		BasicOpn1 so= new BasicOpn1();
		boolean st3=so.isspecialdigit(st);
		 System.out.println(st3);


	}

}
