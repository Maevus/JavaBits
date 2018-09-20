package edu.negl.shapes;
import java.awt.Rectangle;


public class AreaTester {

	
	public static void main(String[] args) {
		
		Rectangle box = new Rectangle(0, 0, 10, 20);
		
		System.out.println("Area of rectangle is " + getArea(box));
		System.out.println("Expected area: 200");
		System.out.println("Perimeter of rectangle is " + getPerimeter(box));
		System.out.println("Expected perimeter: 60 ");
		
	}
	
	private static double getArea(Rectangle box) {
		// calculate area of box
		
		double area = box.getHeight() * box.getWidth();
		return area;	
		
	}
	
	private static double getPerimeter(Rectangle box) {
		// calculate perimeter of box
		
		double per = box.getHeight()*2 + box.getWidth()*2;
		
		return per;
		
	}
	
}
