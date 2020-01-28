package newpackage;

public class Printdemo8 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	
		for(int r=n; r>=1; r--) 
		{ 
			for (int c=1;c<=r;c++)
			   { 
				System.out.print(c+""); 
		
				} 
			System.out.println(); 
			}
	}

}
