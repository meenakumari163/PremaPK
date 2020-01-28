package Stirngprograms;

public class StringOperations {
	
public	String tolowercase(String str) 
	{
		
    char ch[]= str.toCharArray();
    
    for (int i = 0; i<ch.length; i++)
      {
		if(ch[i]>=65&&ch[i]<=90)
		{
			ch[i]=(char)(ch[i]+32);
			
		}
	  }
	String st = new String(ch);
	return st;
}
  int sumofdigits(String st)
  {
	  char ch[]=st.toCharArray();
	  int  sum=0;
	  for (int i = 0; i < ch.length; i++)
	  {
		char ch1= st.charAt(i);
		{
			if(ch1>=48&&ch1<=57) 
			{
				sum=sum+(ch1-48);
			}
		}
	  }
	return sum;
	}

  public int  countwords(String st) 
  { 
  int wc=0;
  
  char ch[]= st.toCharArray();
  for (int i = 0; i < ch.length; i++)
  {
	if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
	{
		wc++;
		
	}
	
  }
  return wc;
  }
	  
 }