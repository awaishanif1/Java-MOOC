package week1;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner a = new Scanner(System.in);
	System.out.print("Write a number: ");
	int b = Integer.parseInt(a.nextLine());
	System.out.print("Write another number: ");
	int c = Integer.parseInt(a.nextLine());
	int bigger = Math.max(b, c);
	System.out.println("The bigger number of the two numbers given was: " + bigger);
	
	
	
	}
}
