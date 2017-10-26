package week1;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner a = new Scanner(System.in);
		System.out.print("Type the radius ");
		float radius = Float.parseFloat(a.nextLine());
		double Circumference = 2*Math.PI*radius;
		System.out.println("Circumference of the circle: " + Circumference );
	}

}
