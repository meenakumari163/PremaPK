package ArraysPrograms;

public abstract class BasicArray {

	public static void main(String[] args) {
		
		int ar[]= {23,45,67,89};
		
		System.out.println(ar);
		System.out.println(ar.length);
		System.out.println("First value:"+ar[0]);
		System.out.println("last value:"+ar[ar.length-1]);
		
		/*for (int i = 0; i < ar.length; i++)
		{
			
			System.out.println(i+"........."+ar[i]);
		}*/
		for (Object ob: ar){
			System.out.println(ob);
			
		}
	}
}