package ArraysPrograms;

public class UnionArray {

	public static void main(String[] args) {
		
		ArrayOptions9 ao = new ArrayOptions9();
		System.out.println("Read  First array Elements is:");
		int a[] = ao.readArr();
		System.out.println("Read  second array Elements is:");
		int b[] = ao.readArr();
		int c[] = ao.Union(a, b);
		System.out.println("Entered First Array Elements is :");
		ao.dispArr(a);
		System.out.println("Entered second Array Elements is :");
		ao.dispArr(b);
		System.out.println("union Array Elements is :");
		ao.dispArr(c);

	}

}
