package ArraysPrograms;

public class InsertanElement {

	public static void main(String[] args) {
  
		ArrayOptions2  ao = new ArrayOptions2();
		int arr[]= {23,45,67,43,32,12};
		System.out.println("Before sorting");
		ao.dispArr(arr);
		arr= ao.insertArr(arr, 63, 3);
		System.out.println("After insert");
		ao.dispArr(arr);
		

	}

}
