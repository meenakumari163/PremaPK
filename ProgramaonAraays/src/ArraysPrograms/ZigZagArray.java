package ArraysPrograms;

public class ZigZagArray {

	public static void main(String[] args) {
	
		ArrayOptions ao = new ArrayOptions();
		System.out.println("Read the fist Array elements");
		int a[]=ao.readArr();
		System.out.println("Read the second Array elements ");
		int b[] = ao.readArr();
		int c[] = ao.ZigZag(a, b);
		System.out.println("Entered First Array Elements is :");
		ao.dispArr(a);
		System.out.println("Entered second Array Elements is :");
		ao.dispArr(b);
		System.out.println("Merged Array Elements is :");
		ao.dispArr(c);
		

	}

}
