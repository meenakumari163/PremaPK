package Stirngprograms;

public class StOpn {
	boolean ispalindrome(String st)
	{
		int i=0;
		while(i<st.length()/2)
		   {
			if(st.charAt(i)!=st.charAt(st.length()-1-i))
				return false;
			    i++;
			    }
		return true;
	}

}
