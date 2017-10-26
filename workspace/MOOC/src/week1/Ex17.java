package week1;
import java.util.Scanner;
public class Ex17 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type the first number: " );
		int b = Integer.parseInt(a.nextLine());
		System.out.println("Type the second number: " );
		int c = Integer.parseInt(a.nextLine());
		if(b>c)
		{
			System.out.println("Greater number: " + b);
		}
		else if (c>b)
		{
			System.out.println("Greater number: " + c );
		}
		else if(b==c)
		{
			System.out.println("The numbers are equal! " ); 
		}
	}

}
