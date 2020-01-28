package BasicPrgrams;

public class BasicOpn9 {

	public int palindrome(int n) {
	      int t=n;
		  int rev=0;
			do {
				int r=n%10;
				rev=rev*10+r;
				n=n/10;
			  }
			  while(n!=0);
			
	if(t==rev) 
       {
	   System.out.println("num is palindrome");
	   }
      else 
     {
      System.out.println("num is not palindrome");
	  }
	return rev;
}
}
