import javax.swing.JOptionPane;

public class InputDialogue {
	
	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "hello " + name);
		System.exit(0);
		
	}

}
