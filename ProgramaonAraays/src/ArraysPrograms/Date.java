package ArraysPrograms;

import java.util.Scanner;

public class Date {
	int dd,mm,yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	public  Date(int dd,int mm, int yy)
	{
	this.dd=dd;
	this.mm=mm;
	this.yy=yy;
	
	if(yy%400==0||yy%4==0&&yy%100!=0)
	{
	month[2]=29;
	}
	}
public  int numberofdays()
{
	int days=dd;
	int y=yy-1;
	days=days+y*365;
	int ln= y/400+y/4-y/100;
	days=days+ln;
	for(int i=1;i<mm;i++)
	{
		days=days+month[i];
		
	}
		
	return days;
}
	@Override
public String toString() {
	return  " "+dd+"/"+mm+"/"+yy;
}
	public static Date readDate() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date(dd mm yy)");
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
	return new Date(dd, mm, yy);
	}
	
	public static void main(String[] args) {
	Date d1= Date.readDate();
	Date d2=Date.readDate();
	System.out.println("number of days between");
	System.out.println(d1+"and"+d2+"is:"+(d2.numberofdays()-d1.numberofdays()));

	}

}
