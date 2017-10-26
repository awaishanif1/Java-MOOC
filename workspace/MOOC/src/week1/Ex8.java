package week1;
import java.util.Scanner;
public class Ex8 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter a Number: " );
		int a = Integer.parseInt(reader.nextLine());
		System.out.println("Enter another Number: ");
		int b = Integer.parseInt(reader.nextLine());
		int sum = a + b;
		System.out.println("Sum of the Numbers: " + sum);
		
	}

}
