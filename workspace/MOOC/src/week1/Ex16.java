package week1;
import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner a = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int b = Integer.parseInt(a.nextLine());
	if(b%2==0)
			{
		System.out.println("The number is even.");
			}
	else
			{
		System.out.println("The number is odd.");
			}
	}
}