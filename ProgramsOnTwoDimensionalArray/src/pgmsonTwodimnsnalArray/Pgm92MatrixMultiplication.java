package pgmsonTwodimnsnalArray;

public class Pgm92MatrixMultiplication {

	public static void main(String[] args) {
		
		TwoDnalArrayOperations92 	mat  = new TwoDnalArrayOperations92();
		int x[][]= mat.readmat();
		System.out.println("before mul m1");
		mat.dispmat(x);
		
		int y[][]= mat.readmat();
		System.out.println("before mul m2");
		mat.dispmat(y);
		
		
		//mat.dispArr(x);
		System.out.println("After mul");
		mat.matrixmul(x, y);
		
		
		

	}

}
