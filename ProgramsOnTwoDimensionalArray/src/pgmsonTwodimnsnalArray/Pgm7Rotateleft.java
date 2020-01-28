package pgmsonTwodimnsnalArray;

public class Pgm7Rotateleft {

	public static void main(String[] args) {
		TwoDnalArrayOperations7	mat  = new TwoDnalArrayOperations7();
		int x[][]= mat.readmat();
		System.out.println("before rotate");
		mat.dispmat(x);
		
		System.out.println("After rotate");
		mat.rotateleft(x);
		mat.dispmat(x);
		

	}

}
