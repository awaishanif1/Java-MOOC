package week1;
import java.util.Scanner;
public class NameAndAgeGreeting {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		System.out.print("Your Name?: ");
		String name = reader.nextLine();
		System.out.println("How old are you: ");
		int age = Integer.parseInt(reader.nextLine());
		System.out.println("Your name is " + name +" and you are " + age + 
				" years old , nice to meet you!" );
	}
}
