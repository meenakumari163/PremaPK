import java.util.Scanner;

public class Print16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter value of n");
		int n=sc.nextInt(); 
		int k=1;
		
		for(int i=1;i<=n ;i++) 
		{ 
			
			for ( int j=1;j<=n; j++)
			    { 
				System.out.print(k%2+" ");
				k++;
				if(k==10)
					k=0;
				} 
			System.out.println(); 
		
	}

	}

}
