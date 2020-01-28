package BasicPrgrams;

public class BasicOpn2
{
     int getcountofnumber(int n)
     {
    	
    	 int count =0;
    	do 
    	{
    		count++;
    		n=n/10;
    	}
    	while(n!=0);
		return count;
     }
}
