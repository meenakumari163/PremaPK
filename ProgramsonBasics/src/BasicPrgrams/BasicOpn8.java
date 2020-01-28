package BasicPrgrams;

public class BasicOpn8 {

	public int revesre(int n) {
		int rev=0;
		do {
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		while(n!=0);
		return rev;
	}
	}


