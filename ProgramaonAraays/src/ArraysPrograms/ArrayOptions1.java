package ArraysPrograms;

import java.util.Scanner;

public class ArrayOptions1 {
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
			
	public int[] merge(int[] a,int[] b) {
		int[] rs= new int[a.length+b.length];
		int i=0, j=0,k=0;

	    
			while(i<a.length&&j<b.length) {
				if( a[i]<b[j]) 
				{
				rs[k]=a[i];
				k++;
				i++;
			    }
				else {
				rs[k++]	=b[j++];	
				}
			}
				
			while(i<a.length) {
				rs[k++]= a[i++];
			}
			while(j<b.length) {
				rs[k++]= b[j++];
			}
			return rs;
	}


}	
	


