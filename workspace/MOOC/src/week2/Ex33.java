package week2;
import java.util.Scanner;
class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("First: ");
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		int b = Integer.parseInt(a.nextLine());
		System.out.println("Last: ");
		@SuppressWarnings("resource")
		Scanner c = new Scanner(System.in);
		int d = Integer.parseInt(c.nextLine());
		//int e=1;
		int sum=0;
		while(b<=d)
		{
		 sum = sum+b;
		 b++;
		}
		System.out.println("Sum is:" + sum);
	}

}
