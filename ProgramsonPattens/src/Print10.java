import java.util.Scanner;

public class Print10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		for(int i=0;i<=n ;i++) 
		{ 
			 int k= 65;
			for ( int j=1;j<=n; j++)
			    { 
				System.out.print( (char) (k)+" ");
				k++;
				} 
			System.out.println(); 
		
		}

	}

}
