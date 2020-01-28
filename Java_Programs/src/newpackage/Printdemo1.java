package newpackage;

public class Printdemo1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		
		java.util.Scanner sc=new java.util.Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		for(int i=1;i<=n ;i++) 
		{ 
			for (int j=1;j<=n ;j++)
			   { 
				System.out.print("* "); 
				} 
			System.out.println(); 
			}
	}

}
