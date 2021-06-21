//Area and Circumference of Circle
import java.util.*;
class Circle{
	public static void main(String args[]){
		double r, area, circum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		r = sc.nextDouble();
		area = 3.14 * r * r;
		circum = 2 * 3.14 * r;
		System.out.println("Area of the Circle = " + area);
		System.out.println("Circumference of the circle = " + circum);
	}
}