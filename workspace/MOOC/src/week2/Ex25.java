package week2;
import java.util.Scanner;
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.println("Type the First Number: ");
		int b = Integer.parseInt(a.nextLine());
		System.out.println("Type the Second Number: ");
		int c = Integer.parseInt(a.nextLine());
		System.out.println("Type the Third Number: ");
		int d = Integer.parseInt(a.nextLine());
		int sum = b+c+d;
		System.out.println("Sum: " + sum);

	}

}
