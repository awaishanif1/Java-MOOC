package week2;
import java.util.Scanner;

	public class Ex32 {
		public static void main(String[] args)
		{
			System.out.print("Until what? ");
			@SuppressWarnings("resource")
			Scanner a = new Scanner(System.in);
			int b = Integer.parseInt(a.nextLine());
			int c = 1;
			int sum=0;
			while(c<=b)
			{
				sum = sum+c;
				c++;
				
			}
			System.out.println("Sum is " + sum);
		}
}
