package ArraysPrograms;

public class Reverse {

	public static void main(String[] args) {
		ArrayOptions4  ao = new ArrayOptions4();
	int a[]= {23,45,66,78};
	System.out.println("before reverse");
	ao.dispArr(a);
	System.out.println("After reverse");
	ao.reverse(a);
	ao.dispArr(a);
	
	

	}

}
