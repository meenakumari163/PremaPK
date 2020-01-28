package ArraysPrograms;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayOptions12 {
	
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
		int[]  pairofele(int a[],int n) {
			
			for(int i=0; i<a.length;i++)
			{
			
				for( int j=i+1;j<a.length;j++)
				{
					if(a[i]+a[j]==n)
					{
					System.out.println(a[i]+" "+a[j]);
				
					}
				}
			}
			return a;
		}
}

	