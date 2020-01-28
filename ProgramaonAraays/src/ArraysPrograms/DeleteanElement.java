package ArraysPrograms;

public class DeleteanElement {

	public static void main(String[] args) {

		ArrayOptions6  ao = new ArrayOptions6();
		int arr[]= {23,45,67,43,32,12};
		System.out.println("Before delete");
		ao.dispArr(arr);
		arr= ao.deleteArr(arr, 3);
		System.out.println("After delete");
		ao.dispArr(arr);
		

	}

}
