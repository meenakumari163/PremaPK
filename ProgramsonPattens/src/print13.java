import java.util.Scanner;

public class print13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int k= 65;
		
		for(int i=1;i<=n ;i++) 
		{ 
			
			for ( int j=1;j<=n; j++)
			    { 
				System.out.print( (char) (k)+" ");
				k++;
				} 
			System.out.println(); 
		
		}

	}

}