package ArraysPrograms;

public class ArrayOptions3 {
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

	public  int[] ReplaceArr(int[] a, int ele,int in ) {
		if(in<0||in>a.length)
		{
			System.out.println("index not in the range");
			return a;
		}
		int na[]= new int[a.length];
		
     for (int i = 0; i < a.length; i++) {
    	 
	if(i==in)
	   	
		na[i]=ele;
		
	else 
	
		na[i] =a[i];}
     
    return na;
	}
  }





