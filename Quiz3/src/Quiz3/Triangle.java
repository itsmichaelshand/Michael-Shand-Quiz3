/**
 * @author Michael Shand
 * Quiz3 Question 1
 */

package Quiz3;

//imports needed for this project
import java.text.DecimalFormat;

public class Triangle {

	// private methods for the three sides of the triangle
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	// my main method
	public static void main(String[] args) {
		// this so i can call non-static methods in my main
		Triangle tgl = new Triangle();
		tgl.toString();

	}

	public Triangle() {
		// no-args constructor
	}

	// my constructor with the three arguments of the sides
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	
	//this is my method to calculate the area of the triangle
	public double getArea() {
		//initialize variables needed to find the area
		double area;
		double p = (side1 + side2 + side3) / 2;
		//the calculation i found online that gives me the area of a triangle
		area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		//converts the long double into only having four decimals on the end
		DecimalFormat df = new DecimalFormat("#.####");
		String s = df.format(area);
		area = Double.parseDouble(s);
		return area;
	}

	//my method to calculate the perimeter of the triange
	public double getPerimeter() {
		//the calculation i used to get the perimeter
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}

	//this is my method to create the description of the triangle
	//is displays the length of all three sides, the area and the perimeter
	public String toString() {
		//Displays the description
		String desc = ("The triangle has side lengths " + side1 + ", " 
														+ side2 + ", " 
														+ side3 + ". Its Area is " 
														+ getArea()
														+ ". And a Perimeter of " 
														+ getPerimeter() + ".");
		System.out.println(desc);
		return desc;
	}

	// my accessor methods for the three data fields(all three sides)
	// my getters and setters
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}

}
