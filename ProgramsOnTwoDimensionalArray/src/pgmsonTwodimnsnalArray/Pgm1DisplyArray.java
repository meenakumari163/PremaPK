package pgmsonTwodimnsnalArray;

public class Pgm1DisplyArray {

	public static void main(String[] args) {
		
		TwoDnalArrayOperations1 	mat  = new TwoDnalArrayOperations1();
		int x[][]= mat.readmat();
		mat.dispmat(x);
	}
}
