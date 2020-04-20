package content1;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyJFrame extends JFrame {
	public MyJFrame() {
		
		this.setSize(900,720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setTitle("’˝œ“”‡œ“");
//		center();
		this.setLocationByPlatform(true);	
		this.add(new DrawLineComponent());
//		pack();
		this.setVisible(true);
//		System.out.println("width:"+this.getSize().width+" height:"+this.getSize().height);
	}
//	private void center() {
//		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
//		Dimension d = this.getSize();
//		this.setLocation((size.width-d.width)/2,(size.height-d.height)/2);
//	}
}
