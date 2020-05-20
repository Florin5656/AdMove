
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Pattern.MainPanel;

public class LogIn extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3L;
	private JPanel contentPane;
	private JTextField loginFild;
	private JTextField paswordFild;
    String login = "";
    String pasword = "";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LogIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		loginFild = new JTextField();
		loginFild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			 login = loginFild.getText();
			}
		});
		loginFild.setBounds(192, 47, 139, 20);
		contentPane.add(loginFild);
		loginFild.setColumns(10);
		
		paswordFild = new JTextField();
		paswordFild.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasword = paswordFild.getText();
			}
		});
		paswordFild.setColumns(10);
		paswordFild.setBounds(192, 91, 139, 20);
		contentPane.add(paswordFild);
		
		JLabel lblNewLabel = new JLabel("LogIn");
		lblNewLabel.setBounds(118, 50, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Password");
		label.setBounds(118, 94, 64, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("R: ...");
		lblNewLabel_1.setBounds(118, 131, 213, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Connect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				login = loginFild.getText();
				pasword = paswordFild.getText();
			//	lblNewLabel_1.setText("1->"+login +" 2->"+pasword);
			if (login != null || pasword != null ) {	
				try {
					if (Main.getuserdb(login,pasword) == true) {
						
						new MainPanel().setVisible(true);
						setVisible(false);
						Main.closedb();
						}else {
							lblNewLabel_1.setText("R: Error not correct pasword or log !");							
						}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				}
			else 
				lblNewLabel_1.setText("R: Error login or password is null!”  ");
			}
		});
		btnNewButton.setBounds(242, 156, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false); 
			}
		});
		btnNewButton_1.setBounds(118, 156, 101, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Register");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Register().setVisible(true);
				setVisible(false);
				
			}
		});
		btnNewButton_2.setBounds(118, 190, 213, 23);
		contentPane.add(btnNewButton_2);
		
		
	}
}
