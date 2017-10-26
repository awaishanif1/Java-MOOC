package week2;
import java.util.Scanner;
public class Ex26 {
	public static void main(String[] args)
	{
	@SuppressWarnings("resource")
	Scanner reader = new Scanner(System.in);
	
	int sum = 0;
	while (true) {
		int read = Integer.parseInt(reader.nextLine());
		if (read==0)
		{
			break;
		}
		else{
			sum = read+sum;
		}
		
		System.out.println("sum now:" + sum);
}
	System.out.println("sum in the end:" + sum);
}
}