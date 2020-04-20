package content2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends JFrame {
	public Menu() {
		this.setSize(500, 300);
		center();
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		JMenu playMenu = new JMenu("������ʾ");
		menuBar.add(playMenu);
		JMenuItem sin = new JMenuItem("���Һ���");
		
		ActionListener dSin = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				add(new DrawSinComponent());
				validate();
			}
		};
		sin.addActionListener(dSin);
		playMenu.add(sin);
		playMenu.addSeparator();
		JMenuItem cos = new JMenuItem("���Һ���");
		cos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getContentPane().removeAll();
				add(new DrawCosComponent());
				validate();
			}
		});
		
		playMenu.add(cos);
		playMenu.addSeparator();
		JMenuItem tan = new JMenuItem("���к���");
		playMenu.add(tan);
		
		JMenu openMenu = new JMenu("���ļ�");
		menuBar.add(openMenu);
		
		
		JMenu quitMenu = new JMenu("�˳�");
		menuBar.add(quitMenu);
		
		Action exitAction = new AbstractAction("�˳�") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		};
		JMenuItem about = new JMenuItem("����");
		quitMenu.add(about);
		playMenu.addSeparator();
		quitMenu.add(exitAction);
		

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void center() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension d = this.getSize();
		this.setLocation((size.width-d.width)/2,(size.height-d.height)/2);
	}
}
