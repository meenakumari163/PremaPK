package BasicPrgrams;

public class BasicOpn11 {

	public boolean isperfect(int n) {
		int sum=0;
	    int i=1;
		while(i<=n/2)
		{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	    }
		return sum==n;
	}
}
