package week1;
import java.util.Scanner;
public class Ex19 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("How old are you? " );
		int age = Integer.parseInt(a.nextLine());
		if (age > 0 && age <=120)
		{
			System.out.println("OK");
		}
		else
			System.out.println("Impossible!");
	}
}
