package pgmsonTwodimnsnalArray;

public class Pgm4RowRevesre {

	public static void main(String[] args) {
	
		TwoDnalArrayOperations4 	mat  = new TwoDnalArrayOperations4();
		int x[][]= mat.readmat();
		System.out.println("before reverse");
		mat.dispmat(x);
		
		
		//mat.dispArr(x);
		System.out.println("After reverse");
		mat.rowreverse(x);
		mat.dispmat(x);
		
		
	}

}
