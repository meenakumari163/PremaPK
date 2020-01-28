package pgmsonTwodimnsnalArray;

public class Pgm91SpiralOrder {

	public static void main(String[] args) {
		
		TwoDnalArrayOperations91	mat  = new TwoDnalArrayOperations91();
		int x[][]= mat.readmat();
		System.out.println("before spiral");
		mat.dispmat(x);
		
		System.out.println("After spiral");
		mat.spiralorder(x, 3);
		//mat.dispmat(x);

	}

}
