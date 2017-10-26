package week2;
import java.util.Scanner;
public class Ex31 {

	public static void main(String[] args) {
		System.out.println("First: ");
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		int b = Integer.parseInt(a.nextLine());
		System.out.println("Last: ");
		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
		int d = Integer.parseInt(c.nextLine());
		while(b<=d) 
		{
			System.out.println(b);
			b++;
		}
	}

}
