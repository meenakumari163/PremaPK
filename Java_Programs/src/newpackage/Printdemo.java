package newpackage;

public class Printdemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int i=1;
		for(int r=1; r<=n; r++) 
		{ 
			for (int c=1;c<=r;c++)
			   { 
				System.out.print(i+""); 
				i++;
				} 
			System.out.println(); 
			}

	}

}