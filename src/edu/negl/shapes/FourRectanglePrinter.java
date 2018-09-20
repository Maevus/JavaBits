package edu.negl.shapes;
import java.awt.Rectangle;

public class FourRectanglePrinter {
	
	public static void main(String[] args)
	{

		Rectangle box = new Rectangle(0, 0, 5, 10);
		System.out.println(box);
		box.translate(0, 5);
		System.out.println(box);
		box.translate(5, -5);
		System.out.println(box);
		box.translate(0, 5);
		System.out.println(box);
		
	}

}
