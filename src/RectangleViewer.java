import javax.swing.JFrame;

public class RectangleViewer {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(300,300);
		frame.setTitle("My Rectangle Madness");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RectangleComponent component = new RectangleComponent();
		frame.add(component);
		
		frame.setVisible(true);
	}

}
