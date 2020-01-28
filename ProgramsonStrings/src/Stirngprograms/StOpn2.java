package Stirngprograms;

public class StOpn2 {
	String initcap(String st)
	{
		char ch[]=st.toCharArray();
		for (int i = 0; i < ch.length; i++)
		{
			if(i==0||ch[i]!=' '&&ch[i-1]==' ') 
			{
				
			if(ch[i]>='a'&&ch[i]<='z')
			{
			ch[i]=(char)(ch[i]-32);
			}
			
			else if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
				
	        }
			}
	  }
		return new String (ch);
}
}