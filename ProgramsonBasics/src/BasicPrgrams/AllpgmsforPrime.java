package BasicPrgrams;

public class AllpgmsforPrime {

	public static void main(String[] args) {
		
		BasicOpn16 so= new BasicOpn16();
		boolean rs = so.isprime(17);
		if(rs)
			System.out.println("17 is prime number");
		else
			System.out.println("17 is not  prime number");
		
		    System.out.println(".......................");
		    so.primenumbers(20);
		    
		    
		    System.out.println(".......................");
		    int cnt = so.numberofprime(100);
		    System.out.println("num of primenumbers between 1 to 100 "+" is "+cnt);
			   
		    
		    
		    System.out.println(".......................");
		    int sum = so.sumofprimenumbers(100);
		    System.out.println("sum of primenumbers between 1 to 100 "+" is "+sum);
		   
		    
		    
		    
		    

	}

}
