package ArraysPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayOptions11 {
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
		int[] minus(int a[],int b[])
		{
			Set<Integer> is = new LinkedHashSet<Integer>();
			
			for(int i=0; i<a.length;i++)
			{
				int j=0;
				while(j<b.length&&a[i]!=b[j])
				{
					j++;
				}
				if(j==b.length)
					is.add(a[i]);
			}
		int rs[] = new int[is.size()];
		int in=0;
		for(Integer ele:is)
		{
		rs[in]	=ele;
		in++;
		}
	return rs;
}
}