import java.util.Scanner;

public class Print2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt();
		 int k=1;
		for(int i=1;i<=n ;i++) 
		{ 
			
			for (int j=k;j<=n ;j++)
			    { 
				System.out.print(k+" "); 
				
				} 
			System.out.println(); 
		
		}
		
	}

}
