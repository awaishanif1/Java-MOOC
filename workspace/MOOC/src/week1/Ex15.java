package week1;
import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("How old are you? ");
		int age = Integer.parseInt(a.nextLine());
		if(age >= 18)
			{
				System.out.println("You have reached the age of maturity.");
			}
		else
			{
				System.out.println("You have not reached the age of maturity.");
			}
	}

}
