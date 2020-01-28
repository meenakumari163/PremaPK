package ArraysPrograms;

public class ArrayOptions4 {
	public void dispArr(int[]  arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.println(" ");
			}
			System.out.println();
        }
	}

	int[] reverse(int arr[])
			{
		for (int i = 0; i < arr.length/2; i++) {
			int t = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i]= t;
			
			
		}
		return arr;
	}

}