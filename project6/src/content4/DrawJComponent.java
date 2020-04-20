package content4;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JComponent;

public class DrawJComponent extends JComponent implements MouseListener,MouseMotionListener{
	boolean isSelected = false;
	boolean rightSelected = false;
	int orix = 0,oriy = 0;
	private ArrayList<ArrayList<Point2D>> all = new ArrayList<ArrayList<Point2D>>();
	private ArrayList<Point2D> x = new ArrayList<Point2D>();
	
	public DrawJComponent() {
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
		Scanner in = null;
		try {
			in = new Scanner(new File("data.txt"));
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		while(in.hasNext()) {
			for(String temp = in.next();!temp.equals("null");temp = in.next()) {
				x.add(new Point2D.Double(Integer.parseInt(temp),
						Integer.parseInt(in.next())));
			}
			all.add(x);
			x = new ArrayList<Point2D>();
		}
		in.close();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		for(ArrayList<Point2D> a : all) {
			for(int i = 1;i<a.size();i++) {
				g.drawLine((int)a.get(i-1).getX(), (int)a.get(i-1).getY(), 
						(int)a.get(i).getX(), (int)a.get(i).getY());
			}
		}
		for(int i = 1;i<x.size();i++) {
			g.drawLine((int)x.get(i-1).getX(), (int)x.get(i-1).getY(), 
					(int)x.get(i).getX(), (int)x.get(i).getY());
		}
		if(rightSelected) {
			g.drawOval(orix-10,oriy-10 ,20, 20);
		}
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(isSelected) {
			x.add(e.getPoint());
			repaint();
		}
		else if(rightSelected) {
			orix = e.getX();
			oriy = e.getY();
			for(int i = 0;i<all.size();i++) {
				boolean yes = false;
				for(Point2D x:all.get(i)) {
					if(x.getX()>orix-10&&x.getX()<orix+10
							&&x.getY()>oriy-10&&x.getY()<oriy+10) {
						yes = true;
						break;
					}
				}
				if(yes)all.remove(i);
			}
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton() == 1) {
			isSelected = true;
		}
		else if(e.getButton() == 2) {
			all = new ArrayList<ArrayList<Point2D>>();
			PrintWriter out = null;
			try {
				out = new PrintWriter("data.txt");
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			out.close();
			repaint();
		}
		else if(e.getButton() == 3) {
			rightSelected = true;
			orix = e.getX();
			oriy = e.getY();
			repaint();
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(isSelected) {
			all.add(x);
			x = new ArrayList<Point2D>();
		}
		saveData();
		repaint();
		isSelected = false;
		rightSelected = false;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void saveData() {
		PrintWriter out = null;
		try {
			out = new PrintWriter("data.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		for(ArrayList<Point2D> b:all) {
			for(Point2D a:b) {
				out.println((int)a.getX()+" "+(int)a.getY());
			}
			out.println("null");
			out.flush();
		}
	}
}
