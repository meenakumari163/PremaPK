package pgmsonTwodimnsnalArray;

public class Pgm9ReverseDiaogonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDnalArrayOperations9	mat  = new TwoDnalArrayOperations9();
		int x[][]= mat.readmat();
		System.out.println("before reverse dioganal");
		mat.dispmat(x);
		
		System.out.println("After reverse dioanal");
		mat.reversediognal(x);
		mat.dispmat(x);
	}

}
