package content2;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CheakJFrame extends JFrame {
	static int count = 0;
	static int folder = 0;
	public CheakJFrame() {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationByPlatform(true);
		this.setLayout(null);
		
		
		JLabel routeLabel = new JLabel("choose path:");
		routeLabel.setFont(new Font("Arial", 0, 24));
		routeLabel.setBounds(70, 20, 200, 50);
		this.add(routeLabel);
		
		JTextArea output = new JTextArea();
		output.setBounds(70, 80, 320, 60);
		output.setLineWrap(true);
		output.setText("Init completed...");
		this.add(output);
		
		JButton cheakButton = new JButton("choose");
		cheakButton.setFont(new Font("Arial", 0, 24));
		cheakButton.setBounds(240, 30, 150, 30);
		
		ActionListener myActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				File file = showFileOpenDialog(CheakJFrame.this);
				if(file==null)return;
				count = 0;
				folder = 0;
				getFile(file);
				output.setText("路径："+file.toString()+"\n文件数目："+count+"\n"+"文件夹数量："+folder);
			}
		};
		
		cheakButton.addActionListener(myActionListener);
		this.add(cheakButton);
		
		this.setVisible(true);
	}
	
	public File showFileOpenDialog(Component parent){
		
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("C:"));
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		fc.setMultiSelectionEnabled(true);
		fc.showOpenDialog(parent);
		File file = fc.getSelectedFile();
		return file;
	}
	
	public static void getFile(File file) {
		
        File[] listfile = file.listFiles();
        for (int i = 0; i < listfile.length; i++) {
            if (listfile[i].isDirectory()) {
            	folder++;
            	getFile(listfile[i]);
            } 
            else {
                count++;
            }
        }
    }
}
