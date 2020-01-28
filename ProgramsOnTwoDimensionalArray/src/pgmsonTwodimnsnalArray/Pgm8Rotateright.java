package pgmsonTwodimnsnalArray;

public class Pgm8Rotateright {

	public static void main(String[] args) {
		TwoDnalArrayOperations8	mat  = new TwoDnalArrayOperations8();
		int x[][]= mat.readmat();
		System.out.println("before rotate");
		mat.dispmat(x);
		
		System.out.println("After rotate");
		mat.rotateright(x);
		mat.dispmat(x);

	}

}
