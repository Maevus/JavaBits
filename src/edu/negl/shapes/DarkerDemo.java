package edu.negl.shapes;
import java.awt.Color;
import javax.swing.JFrame;


public class DarkerDemo {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setSize(200,200);  
		
		Color myCol = (Color.RED.darker()).darker();
		
		frame.getContentPane().setBackground(myCol);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
