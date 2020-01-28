package BasicPrgrams;

public class BasicOpn16 {
	boolean isprime(int n)
	{
		int i=2;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				return false;
			}
			i++;
			}
		return true;
	}
		void primenumbers(int range)
		{
			for(int i=1;i<=range; i++)
			{
				if(isprime(i))
				System.out.print(i+",");
			}
			System.out.println();
		}
  int numberofprime(int range) 
  {
	int count=0;
	for(int i=1; i<=range;i++)
	{
		if(isprime(i))
			count++;
	}
	return count;
  }

 int sumofprimenumbers(int range) 
 {
	 int sum=0;
	 for(int i=1; i<=range;i++)
	 {
		if(isprime(i))
		sum=sum+i;
	 }
	return sum;
	  
  }
}
  
  

