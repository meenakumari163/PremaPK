package ArraysPrograms;

public class ReplaceElement {

	public static void main(String[] args) {


		ArrayOptions3  ao = new ArrayOptions3();
		int arr[]= {23,45,67,43,32,12};
		System.out.println("Before replacing");
		ao.dispArr(arr);
		arr= ao.ReplaceArr(arr, 64, 3);
		System.out.println("After after replacing");
		ao.dispArr(arr);
		

	}
	}


