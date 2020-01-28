package pgmsonTwodimnsnalArray;

public class Pgm5ColumnWiseReverse {

	public static void main(String[] args) {
		
		TwoDnalArrayOperations5 	mat  = new TwoDnalArrayOperations5();
		int x[][]= mat.readmat();
		System.out.println("before reverse");
		mat.dispmat(x);
		
		
		//mat.dispArr(x);
		System.out.println("After reverse");
		mat.colmnreverse(x);
		mat.dispmat(x);
		
		

	}

}
