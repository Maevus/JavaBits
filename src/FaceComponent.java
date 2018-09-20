
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent {
	/* Builds a face component */
	
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g; 
	
		
		// Face outline
		Ellipse2D.Double face = new Ellipse2D.Double(100, 100, 200, 200);
		g2.draw(face);
		
		// Eyes
		Ellipse2D.Double leftEye = new Ellipse2D.Double(155, 150, 20, 20);
		Ellipse2D.Double rightEye = new Ellipse2D.Double(225, 150, 20, 20);
		g2.draw(leftEye);
		g2.draw(rightEye);
		
		// Mouth
		Point2D.Double from = new Point2D.Double(165, 225);
		Point2D.Double to = new Point2D.Double(235, 225);
		Line2D.Double mouth = new Line2D.Double(from, to);
		g2.draw(mouth);
		
	}
}
