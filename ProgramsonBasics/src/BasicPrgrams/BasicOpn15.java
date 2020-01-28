package BasicPrgrams;

public class BasicOpn15 {

	int  numberofDigits(int n) {
		int dc=0;
		while(n>0)
		{
			dc++;
			n=n/10;
		}
		return dc;
	}

	public boolean isamstrong(int no) {
	
		int sum=0, t=no;
		int count=numberofDigits(no);
		while(t>0)
		{
			int r=t%10;
			sum=sum+power(r,count);
			count--;
			t=t/10;
		}
		return sum==t;
	  
	  } 
	int power(int n, int p)
	{
		int pw=1;
		while(pw>1);
		{
			pw=pw*n;
			p--;
		}
		return pw;
}

}
		
		