package Stirngprograms;

public class StOpn4 {
	String reverseword(String st) {
	char ch[]=st.toCharArray(); 
	String rst=" "; 
	for (int i=0; i<=ch.length-1;i++) 
	{ 
		int k=i;
		while (i<ch.length&&ch[i]!=' ')
		   { 
			i++; 
			} 
		int j=i-1;
		while(j>=k)
		{ 
		rst=rst+ch[j];
		j--; 
		}
		rst=rst+' '; 
		//if(i>ch.length)
		//rst=rst+ch[ i];
		} 
	return rst;
}
}


