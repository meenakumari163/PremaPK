package BasicPrgrams;

public class BasicOpn1 {
	
	boolean isspecialdigit(int n) 
	{
		int d1=n/10;
		int d2=n%10;
		int sum = (d1*d2)+d1+d2;
		if(sum==n)
		{
			return true;
		}
		else
		{
			return false;
		}
}
}