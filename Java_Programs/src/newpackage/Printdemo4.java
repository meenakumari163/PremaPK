package newpackage;

public class Printdemo4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner sc=new java.util.Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int i=1;
		for(int r=1; r<n; r++) 
		{ 
			for (int c=1;c<=n;c++)
			   { 
				System.out.print(i+""); 
				i++;
				} 
			System.out.println(); 
			}

	}

}
