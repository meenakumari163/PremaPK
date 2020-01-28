package BasicPrgrams;

public class BasicOpn10 {

	public int fibonacci(int n)
	{
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a);
		System.out .print(b);
		for(int i = 2 ;i <=n; i++)
		{
			c=a + b;
		
			if(c<=n);
			{
			
				System.out.print(c);
				a=b;
				b=c;
			}
		}
		return c;
		
	}

}