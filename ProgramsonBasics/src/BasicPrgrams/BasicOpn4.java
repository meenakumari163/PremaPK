package BasicPrgrams;

public class BasicOpn4 {


int sumofint(int n) {
	int sum=0;
	do
	{
		int r=n%10;
		sum=sum+r;
		n=n/10;
	}
	 while(n!=0);	
	
	return sum;
}
}