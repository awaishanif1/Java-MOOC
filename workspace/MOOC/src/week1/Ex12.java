package week1;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type your name: ");
		String b = a.nextLine();
		System.out.println("Type your age: ");
		int c = Integer.parseInt(a.nextLine());
		System.out.print("Type your name: ");
		String d = a.nextLine();
		System.out.println("Type your age: ");
		int e = Integer.parseInt(a.nextLine());
		int sum = c + e;
		System.out.println(b + " and " + d + " are " + sum + " years old in total.");
		
		
	}
}
