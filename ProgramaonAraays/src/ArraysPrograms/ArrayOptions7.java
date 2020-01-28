package ArraysPrograms;

public class ArrayOptions7 {
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

   int[] biggest(int a[]) {
   int big=a[0];
	  for (int i = 1; i<a.length-1; i++)
	  {
    	  if (a[i]>big) 
    	  {
    	   big=a[i];
    	  }
	   }
    	  System.out.println(big);
		return a;
    	 }
}