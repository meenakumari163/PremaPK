package ArraysPrograms;

public class ArrayOptions6 {
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

   int[] deleteArr(int a [],int in) {
   
   if(in<0||in>a.length)
	{
		System.out.println("index not in the range");
		return a;
	}
	int na[]= new int[a.length-1];
	
      for (int i = 0; i < na.length; i++)
       {
	     if(i<in)
         na[i]=a[i];
         else 
         na[i] =a[i+1];
       }

     return na;
   }
}
