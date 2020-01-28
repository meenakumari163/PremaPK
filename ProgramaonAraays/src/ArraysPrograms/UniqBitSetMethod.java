package ArraysPrograms;

public class UniqBitSetMethod {

	public static void main(String[] args) {
	int arr[]= {34,56,78,56,56,78,56,33,65,12};
	int count[]=new int[1000];
     for (int i = 0; i < arr.length; i++)
        {
    	count[arr[i]]++;
        }
      for (int i = 0; i < count.length; i++) 
       {
    	 if(count[i]!=0) 
    	 {
    	  System.out.println(i+"........."+count[i]);	 
          }
		
	   }

	}

}
