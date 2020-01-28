package pgmsonTwodimnsnalArray;

public class Pgm2Biggestvalue {

	public static void main(String[] args) {
		TwoDnalArrayOperations2 	mat  = new TwoDnalArrayOperations2();
		int x[][]= mat.readmat();
		mat.dispmat(x);
		
		int b=(int) mat.biggestmat(x);
		//for (int i = 0; i < b.length; i++) {
			
			System.out.println("row biggest ele is:"+b);
			
		//}
		
	

	}

}
