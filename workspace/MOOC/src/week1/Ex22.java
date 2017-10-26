package week1;
import java.util.Scanner;
public class Ex22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type the password: ");
				String c = a.nextLine();
				while(!(c.equals("carrot")))
				{
					System.out.println("Wrong!");
					System.out.print("Type the password: ");
					String command = a.nextLine();
				    if (command.equals("carrot")) {
				        break;
				}
				}
				System.out.println("Right!");
				System.out.println("The Secret is that You are Alone!");

	}

}
