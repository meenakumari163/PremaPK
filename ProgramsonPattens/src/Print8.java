import java.util.Scanner;

public class Print8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		for(int i=0;i<=n ;i++) 
		{ 
			 int k= 65;
			for ( int j=0;j<=n; j++)
			    { 
				System.out.print( (char) (k+i)+" "); 
				} 
			System.out.println(); 
		
		}

	}

}
/*A A A A A A 
B B B B B B 
C C C C C C 
D D D D D D 
E E E E E E 
F F F F F F*/