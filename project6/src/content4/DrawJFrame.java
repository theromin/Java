package content4;

import java.io.FileNotFoundException;

import javax.swing.JFrame;

public class DrawJFrame extends JFrame {
	public DrawJFrame() throws FileNotFoundException {
		this.setSize(500, 500);
		this.setLocationByPlatform(true);
		this.add(new DrawJComponent());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
