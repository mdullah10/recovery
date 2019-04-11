import java.util.Scanner;
public class p1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.println("enter length");
		double length = input.nextDouble();
		System.out.println( "enter height");
		double height = input.nextDouble();
		System.out.println("enter width");
		double width = input.nextDouble();
		
		
		double square = MdUllah(length,height,width);
		System.out.println("square is " + square );
		

	}

	private static double MdUllah(double length, double height, double width) {
		// TODO Auto-generated method stub
		return length*height*width;
	}

}
