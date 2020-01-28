package ArraysPrograms;

public class DisplayPairofElements {

	public static void main(String[] args) {
		ArrayOptions12  ao = new ArrayOptions12();
		int a[]= {8,7,5,4,3,2,9,1,6,10};
		System.out.println("Before  arrange the pair");
		ao.dispArr(a);
		
		System.out.println("After arrangng the pair");
		a= ao.pairofele(a, 12);
		

	}

}
