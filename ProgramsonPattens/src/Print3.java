
public class Print3
{

	public static void main(String[] args)
	{
		java.util.Scanner sc=new java.util.Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		//for(int i=1;i<=n ;i++) 
		//{ 
			for (int r=1;r<=n ;r++)
			   { 
				for(int c=1;c<=n; c++) 
				{
				System.out.print(r); 
				}
			 System.out.println(); 
		}
		//}

	}

}
