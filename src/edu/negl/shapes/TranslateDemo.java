package edu.negl.shapes;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TranslateDemo {
	
	public static void main(String[] args)
	{
		// Construct a frame and show it
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Rectangle box = new Rectangle(400, 400, 5, 10);
		frame.setBounds(box);
		
		JOptionPane.showMessageDialog(frame, "Click OK to continue");
		
		box.translate(400, 200);
		frame.setBounds(box);
		
		JOptionPane.showMessageDialog(frame, "Click OK to finish");
	}

}
