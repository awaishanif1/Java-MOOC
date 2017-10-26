package week1;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type your username: ");
		String username = a.nextLine();
		System.out.println("Type your Password: ");
		String password = a.nextLine();
		if (username.equals("alex") && password.equals("mightyduck"))
			{
			System.out.println("You are now logged into the system!");
			}
		else if (username.equals("emily") && password.equals("cat"))
			{
			System.out.println("You are now logged into the system!");
			}
		else
			{
			System.out.println("Your username or password was invalid!");
			}
	}

}
