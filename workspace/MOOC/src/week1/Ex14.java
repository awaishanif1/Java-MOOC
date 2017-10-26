package week1;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type a Number: ");
		int b = Integer.parseInt(a.nextLine());
		if(b>0)
				{
					System.out.println("The number is positive.");
				}
		else if(b==0)
				{
					System.out.println("The number is 0, which is neither positive nor negative.");
				}
		else
				{
					System.out.println("The number is not positive.");
	}
				}
}
