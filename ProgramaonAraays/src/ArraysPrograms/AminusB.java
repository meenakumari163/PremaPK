package ArraysPrograms;

public class AminusB {

	public static void main(String[] args) {
		
		ArrayOptions11 ao = new ArrayOptions11();
		System.out.println("Read  First array Elements is:");
		int a[] = ao.readArr();
		System.out.println("Read  second array Elements is:");
		int b[] = ao.readArr();
		int c[] = ao.minus(a, b);
		System.out.println("Entered First Array Elements is :");
		ao.dispArr(a);
		System.out.println("Entered second Array Elements is :");
		ao.dispArr(b);
		System.out.println("Intersection Array Elements is :");
		ao.dispArr(c);

	}

}
