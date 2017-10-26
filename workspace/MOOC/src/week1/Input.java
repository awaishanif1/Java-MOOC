package week1;
import java.util.Scanner;//for taking user input

public class Input {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = reader.nextLine();
		System.out.println("Hi, " + name);
		
	}
}
