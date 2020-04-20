package content2;

import java.awt.Graphics;

import javax.swing.JComponent;

public class DrawSinComponent extends JComponent {
	@Override
	protected void paintComponent(Graphics g) {
		int width = this.getSize().width;
		int height = this.getSize().height;
		g.drawLine(0, height/2, width, height/2);
		g.drawLine(width/2, 0, width/2, height);
		for(int i=-width/2;i<width/2;i++)
			g.drawLine(i+width/2, (int)(height/2-Math.sin(i/50.0)*100), 
					i+width/2, (int)(height/2-Math.sin(i/50.0)*100));
		
	}
}
