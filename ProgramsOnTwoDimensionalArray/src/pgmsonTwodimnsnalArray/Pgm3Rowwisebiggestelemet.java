package pgmsonTwodimnsnalArray;

public class Pgm3Rowwisebiggestelemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		TwoDnalArrayOperations3 	mat  = new TwoDnalArrayOperations3();
		int x[][]= mat.readmat();
		mat.dispmat(x);
		
		int[] b= mat.rowbiggestmat(x);
		for ( i = 0; i < b.length; i++) 
		{
			
			
			System.out.println(i+1+"rowwise biggest ele is:"+b[i]);
			
		}
		
	}

}
