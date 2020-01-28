package ArraysPrograms;

import java.util.Scanner;

public class ArrayOptions2 {

	/*public  int[] readArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of values ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enterd"+n+"values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
		return arr;
		}*/
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

		public  int[] insertArr(int[] a, int ele,int in ) {
			if(in<0||in>a.length)
			{
				System.out.println("index not in the range");
				return a;
			}
			int na[]= new int[a.length+1];
			na[in] = ele;
         for (int i = 0; i < a.length; i++) {
        	 
		if(i<in)
		   	
			na[i]=a[i];
			
		else 
		
			na[i+1] =a[i];}
         
        return na;
		}
      }


