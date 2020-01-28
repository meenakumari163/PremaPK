package ArraysPrograms;

public class ArrayOptions5 {
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

	int[] swap(int arr[]) {
		
		
		/*for (int i=0; i<arr.length/2; i++) {
			int n;
			n=(arr.length/2)+1;
			int t = arr[i];
			arr[i] = arr[n+i];
			arr[n+i]= t;*/
		int n;
		if (arr.length%2==0) 
			n=arr.length/2; 
		else 
			n= (arr.length/2) +1;
		for (int i=0; i<arr.length/2; i++)
		
		{ 
			int t=arr[i]; 
			arr[i] =arr [n+i]; 
			arr [n+i]=t; 
			} 
			
		return arr;
	}
		
}
