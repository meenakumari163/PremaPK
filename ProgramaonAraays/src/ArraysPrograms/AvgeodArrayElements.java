package ArraysPrograms;

import java.util.Scanner;

public class AvgeodArrayElements {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n =sc.nextInt();
	int arr[]= new int[n];
	System.out.println("enter"+n+"values");
	for( int i=0;i<n;i++)
	{
	arr[i] = sc.nextInt();
	}
    System.out.println("enterd array elements");
    double sum=0;
    for(int i=0;i<arr.length;i++)
    {
    System.out.println(i+"......"+arr[i]);
    sum=sum+arr[i];
	}
    System.out.println("sum is:"+sum);
    double avg= sum/arr.length;
    System.out.println("avarage is :"+avg);
	}
}
