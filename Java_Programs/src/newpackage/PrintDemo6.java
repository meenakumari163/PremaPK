package newpackage;

public class PrintDemo6 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	
		for(int r=1; r<=n; r++) 
		{ 
			for (int c=1;c<=r;c++)
			   { 
				System.out.print(r+""); 
				
				} 
			System.out.println(); 
			}

	}

}
