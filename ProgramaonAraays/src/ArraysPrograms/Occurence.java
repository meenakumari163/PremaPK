package ArraysPrograms;

public class Occurence 
{
public static void main(String[] args) 
	{
	 int arr[]= {34,56,78,56,56,78, 56,33,65,12};
	 int n=arr.length;
			
		for(int i=0;i<n;i++)
		{
			int count=1;
		    for(int j=i+1; j<n;j++)
			{
				if (arr[i]==arr[j])
				{
				count++;
				arr[j]=arr[n-1];
				j--;
				n--;
				}
				
			}
		System.out.println(arr[i]+"......."+count);
      }
	}

}

