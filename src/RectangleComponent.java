import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;


public class RectangleComponent extends JComponent{
	
	public void paintComponent(Graphics g) 
	{
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle box = new Rectangle(5 , 10, 20, 20);
		g2.draw(box);
		
		box.add(50, 50);
		
		g2.draw(box);
		
		Rectangle box2 = new Rectangle(50, 50, 20, 20);
		g2.draw(box2);
		
		
	}
	

}
