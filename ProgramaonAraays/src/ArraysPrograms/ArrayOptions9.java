package ArraysPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayOptions9 {
	public  int[] readArr() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of values ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enterd"+n+"values");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
		return arr;
		}
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
		int [] Union(int a[], int b[])
				{
				Set<Integer> us =new LinkedHashSet<Integer>(a.length);
				
			for(int i=0; i<a.length; i++)
			{
				us.add(a[i]);
			}
			for(int i=0; i<b.length;i++)
			{
				us.add(b[i]);
			}
			int u[]=new int[us.size()];
			int in=0;
			for(Integer ele:us)
			{
				u[in]= ele;
				in++;
			}
			return u;
       }
}
