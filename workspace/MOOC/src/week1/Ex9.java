package week1;
import java.util.Scanner;
public class Ex9 {
		public static void main(String[] args){
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
			System.out.print("Enter a Number: " );
			float a = Float.parseFloat(reader.nextLine());
			System.out.println("Enter another Number: ");
			float b = Float.parseFloat(reader.nextLine());
			float Division = a / b;
			System.out.println("Division: "+ a +  " / " + b + " = " + Division);
			
		}

	}
