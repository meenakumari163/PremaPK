package BasicPrgrams;

public class BasicOpn13 {

	public boolean isstrong(int n) 
	{
           int sum=0;
		   int t=n;
		do {
			int r=n%10;
			sum=sum+fact(r);
			n=n/10;
		}
		while(n!=0);
			return sum==t;
		}
	
	int fact(int r) {
	int f=1;
	while(r!=0) {
		f=f*r;
		r--;
		
	}
	return f;
}
}