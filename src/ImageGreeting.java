
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageGreeting {
	
	public static void main(String[] args)
	{
		URL imageLocation = null;
		try {
			imageLocation = new URL(
					"https://orig00.deviantart.net/8d86/f/2018/255/a/0/the_dragon_of_milos_by_petros_stefanidis-dcmnoci.jpg");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "This rock looks like a dragon"
				+ "", "Dragons",JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
		System.exit(0);
	}

}
