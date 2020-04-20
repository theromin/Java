package content3;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;

public class DrawLineComponent extends JComponent implements MouseListener, MouseMotionListener{
//	private int width = 800,height = 400;
	private int orix,oriy, x0=0; 
	private int rectWidth = 10;
	private int standardX = 50,standardY = 100;
	private boolean rightSelected = false;
	private boolean leftXSelected = false;
	private boolean leftYSelected = false;
	public DrawLineComponent() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		int width = this.getSize().width,height = this.getSize().height;
		g.drawLine(0, height/2, width, height/2);
		g.drawLine(width/2, 0, width/2, height);
		g.drawRect(width/2+standardX-rectWidth/2, height/2-rectWidth/2, rectWidth, rectWidth);
		g.drawRect(width/2-rectWidth/2, height/2-standardY-rectWidth/2, rectWidth, rectWidth);
		for(int i=-width/2;i<width/2;i++)
			g.drawLine(i+width/2, (int)(height/2-Math.sin((i-x0)/(double)standardX)*standardY),
					i+width/2,(int)(height/2-Math.sin((i-x0)/(double)standardX)*standardY));
	
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		int width = this.getSize().width,height = this.getSize().height;
		if(x >= width/2+standardX-rectWidth/2 && x <= width/2+standardX+rectWidth/2 &&
				y >= height/2-rectWidth/2 && y <= height/2+rectWidth/2) {
			setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		else if(x >= width/2-rectWidth/2 && x <= width/2+rectWidth/2 &&
				y >= height/2-standardY-rectWidth/2 && y <= height/2-standardY+rectWidth/2) {
			setCursor(new Cursor(Cursor.HAND_CURSOR));
		}
		else setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		int b = e.getButton();
		if(b==3) {
			rightSelected = true;
		}
		else if (b==1) {
			int x = e.getX(), y = e.getY();
			int width = this.getSize().width,height = this.getSize().height;
			if(x >= width/2+standardX-rectWidth/2 && x <= width/2+standardX+rectWidth/2 &&
					y >= height/2-rectWidth/2 && y <= height/2+rectWidth/2) {
				leftXSelected = true;
				orix = x;
			}
			else if(x >= width/2-rectWidth/2 && x <= width/2+rectWidth/2 &&
				y >= height/2-standardY-rectWidth/2 && y <= height/2-standardY+rectWidth/2) {
				leftYSelected = true;
				oriy = y;
			}
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		rightSelected = false;
		leftXSelected = false;
		leftYSelected = false;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(rightSelected) {
			int x = e.getX();
			int deltax = x - orix;
			x0 += deltax;
			orix = x;
			repaint();
		}
		else if(leftXSelected) {
			int x = e.getX();
			int deltax = x - orix;
			standardX += deltax;
			orix = x;
			repaint(); 
		}
		else if(leftYSelected) {
			int y = e.getY();
			int deltay = y - oriy;
			standardY -= deltay;
			oriy = y;
			repaint(); 
		}
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		
	}
}
