package area;

import java.util.Scanner;

public class area1 {

	public static double area(double circle) {
		return Math.PI*Math.pow(circle,2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner circle= new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double circle1= circle.nextDouble();
		
		System.out.println(area(circle1));
	}

}
