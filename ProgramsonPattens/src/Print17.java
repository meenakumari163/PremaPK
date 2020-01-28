import java.util.Scanner;

public class Print17 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter  the string");
		String st=sc.nextLine();
		
		
		for(int i=0;i<st.length() ;i++) 
		{ 
			
			for ( int j=0;j<st.length(); j++)
			    { 
				System.out.print(st.charAt(i)+" ");
				
				} 
			System.out.println(); 
		
	}

	}

}
