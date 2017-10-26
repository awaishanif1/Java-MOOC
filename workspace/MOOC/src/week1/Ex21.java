package week1;
import java.util.Scanner;
public class Ex21 {
public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner a = new Scanner(System.in);
	System.out.print("Type a Year: ");
	int year = Integer.parseInt(a.nextLine());
	if(year %4 ==0)
	{
		System.out.println("The year is a leap year");
	}
	else if(year %100 ==0)
	{
		System.out.println("The year is not a leap year");
	}
	else if (year % 400 ==0)
	{
		System.out.println("The year is a leap year");
	}
	else
	{
		System.out.println("The year is not a leap year");
	}
	
}

}
