package week1;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type the points [0-60]: ");
		int b = Integer.parseInt(a.nextLine());
		if(b>= 0 && b <= 29)
		{
			System.out.println("failed");
		}
		else if(b> 29 && b<=34)
		{
			System.out.println("Grade: 1");
		}
		else if(b> 34 && b<=39)
		{
			System.out.println("Grade: 2");
		}
		else if(b> 34 && b<=44)
		{
			System.out.println("Grade: 3");
		}
		else if(b> 44 && b<=49)
		{
			System.out.println("Grade: 4");
		}
		else if(b> 49 && b<=60)
		{
			System.out.println("Grade: 5");
		}
	}
}
