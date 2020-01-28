import java.util.Scanner;

public class Print1
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
	 for(int i=1;i<=n ;i++) 
     { 
			for (int j=0;j<=n ;j++)
			   { 
				System.out.print("*"+" "); 
				} 
		System.out.println();
	 }
		
   }

}
