package pgmsonTwodimnsnalArray;

public class Pgm6Transpose {

	public static void main(String[] args) {
		
		TwoDnalArrayOperations6 mat  = new TwoDnalArrayOperations6();
		int x[][]= mat.readmat();
		System.out.println("before transpose");
		mat.dispmat(x);
		
		
		//mat.dispArr(x);
		System.out.println("After transpose");
		mat.transpose(x);
		mat.dispmat(x);
	}

}
