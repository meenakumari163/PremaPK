package ArraysPrograms;

public class ArrayOptions8 {
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

   int[] Nthbiggest(int[] a,int n) {
	   if(n>a.length||n<1) 
	     {
		   System.out.println("Arra not in th range");
		   return a;
	      }
	   for (int i = 0; i <a.length; i++) 
	   {
		   int count=0;
		   for (int j = 1; j<a.length; j++) 
		   {
			if(a[j]<a[i])
			count++;
		    }
			if(count==n-1)
	        System.out.println( a[i]);
		  
	   }
	  return a; 
   }

}
