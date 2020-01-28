package ArraysPrograms;

public class UiqueElements 
{

	public static void main(String[] args) 
	{
	int[] arr= {34,56,78,56,56,78,56,33,65,12};
	 int [] ar=UniqueArray(arr);
	for (int i = 0; i < ar.length; i++) 
		{
			System.out.println(ar[i]+" ");
		}
		
	}


 static int[] UniqueArray(int[] ar){
	 int n=ar.length;
	 for(int i=0; i<n; i++)
	 {
		 for(int j=i+1;j<n;j++)
		 {
			 if(ar[i]==ar[j])
			 {
				 ar[j]=ar[n-1];
				 j--;
				 n--;
			 }
		 }
	 }
	 int na[]= new int[n];
	 
	 for (int i = 0; i < na.length; i++)
	   {
		na[i]=ar[i]; 
		 
		}
	return na;
		 
 }	 
}


