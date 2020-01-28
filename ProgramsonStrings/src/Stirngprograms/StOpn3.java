package Stirngprograms;

public class StOpn3 {
	String reverasent(String st) {
		char ch[]=st.toCharArray(); 
		String rst=" "; 
		for (int i=ch.length-1;i>=0 ;i-- ) 
		{ 
			int k=i;
			while (i>=0&&ch[i]!=' ')
			   { 
				i--; 
				} 
			int j=i+1;
			while(j<=k)
			{ 
			rst =rst +ch[j];
			j++; 
			}
			//rst=rst+' '; 
			if(i>0)
				rst=rst+ch[i];
			} 
		return rst;
}
}