package week2;
import java.util.Scanner;
public class Ex30 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int read = Integer.parseInt(reader.nextLine());
		System.out.println("Up to what Number? " + read);
		int a = 1;
		while(a<=read)
		{
			System.out.println(a);
			a++;
		}
		
	}

}
