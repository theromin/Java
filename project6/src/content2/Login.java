package content2;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class Login extends JFrame {
	public Login() {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		this.setLocationByPlatform(true);
		this.setLayout(null);
		
		JLabel labelUser = new JLabel("User:");
		labelUser.setFont(new Font("Arial", 0, 24));
		labelUser.setBounds(100, 20, 100, 50);
		this.add(labelUser);
		
		JLabel labelPassword = new JLabel("Password:");
		labelPassword.setFont(new Font("Arial", 0, 24));
		labelPassword.setBounds(60, 60, 200, 50);
		this.add(labelPassword);
		
		JTextField userField = new JTextField();
		userField.setBounds(180, 30, 200, 30);
		this.add(userField);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(180, 70, 200, 30);
		this.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setFont(new Font("Arial", 0, 24));
		loginButton.setBounds(200, 150, 100, 30);
		
		ActionListener myActionListener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String username = "wang";
				String password = "123";
				if(userField.getText().equals(username)) {
					if(String.valueOf(passwordField.getPassword()).equals(password)) {
						setVisible(false);
						JFrame frame = new Menu();
					}
					else {
						JOptionPane.showMessageDialog(Login.this,"Wrong password!");
					}
				}
				else {
					JOptionPane.showMessageDialog(Login.this,"User don't exist!");
				}
			}
		};
		
		loginButton.addActionListener(myActionListener);
		enterPressesWhenFocused(passwordField,myActionListener);
		this.add(loginButton);
		
		center();
		this.setVisible(true);
	}
	
	private void center() {
		Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension d = this.getSize();
		this.setLocation((size.width-d.width)/2,(size.height-d.height)/2);
	}
	
	public static void enterPressesWhenFocused(JPasswordField textField,ActionListener actionListener) {
        textField.registerKeyboardAction(actionListener,
        		KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        textField.registerKeyboardAction(actionListener,
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
    }
}
