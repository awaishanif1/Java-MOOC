package week2;
import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a Number: ");
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		int b = Integer.parseInt(a.nextLine());
		System.out.print(b);
		int Factorial = 1;
		while(b>=1)
		{
//			if(b==0)
//			{
//				System.out.println("Factorial is 1");
//			}
			Factorial=b*b;
			b--;
		}
		System.out.println("Factorial is:" +Factorial);
			
	}

}
