package BasicPrgrams;

public class BasicOpn14 {

	public boolean ishappy(int n) {
		do {
			int sum=0;
			while(n!=0) {
				int d=n%10;
				sum=sum+(d*d);
				n=n/10;
				}
			n=sum;
			}
		while(n>9);
		return n==1||n==7;
	}

}
