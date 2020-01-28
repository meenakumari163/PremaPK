package ArraysPrograms;

public class EvenOROddArray {

	public static void main(String[] args) {
	
		ArrayOptions ao = new ArrayOptions();
		int a[] = ao.readArr();
		System.out.println("enterd array elements");
		ao.dispArr(a);
		System.out.println("................");
		int c[] = ao.CountEvenodd(a);
		System.out.println("number of even number"+ c[0]);
		System.out.println("number of odd number"+ c[1]);
		

	}

}
