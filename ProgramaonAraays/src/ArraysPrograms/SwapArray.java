package ArraysPrograms;

public class SwapArray {

	public static void main(String[] args) {
	
		ArrayOptions5  ao = new ArrayOptions5();
		int a[]= {23,45,66,78};
		System.out.println("before swap");
		ao.dispArr(a);
		System.out.println("After swap");
		ao.swap(a);
		ao.dispArr(a);
		
	}

}
