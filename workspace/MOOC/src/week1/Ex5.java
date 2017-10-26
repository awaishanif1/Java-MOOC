package week1;

public class Ex5 {
	static int Days=365;
	static int Hours=24;
	static int Minutes=60;
	static int Seconds=60;
	static int X;
	public static void main(String[] args){
		X = Days*Hours*Minutes*Seconds;
		System.out.print("There are " + X);
		System.out.print(" seconds in a year.");
	}

}
