//import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Pattern.MainPanel;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Register extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4L;
	private JPanel contentPane;
	private JTextField loginField;
	private JTextField paswordField;
	private JTextField paswordField_2;
	 String login = null;
	 String pasword = null;
	 String pasword2 = null;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
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
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setBounds(184, 11, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LogIn");
		lblNewLabel_1.setBounds(110, 62, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Pasword");
		label.setBounds(94, 98, 72, 14);
		contentPane.add(label);
		
		loginField = new JTextField();
		loginField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 login = loginField.getText();
				   
			}
		});
		loginField.setBounds(198, 59, 150, 20);
		contentPane.add(loginField);
		loginField.setColumns(10);
		
		paswordField = new JTextField();
		paswordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasword = paswordField.getText();
			}
		});
		paswordField.setColumns(10);
		paswordField.setBounds(198, 95, 150, 20);
		contentPane.add(paswordField);
		
		JLabel label_1 = new JLabel("Confirm Pasword");
		label_1.setBounds(60, 142, 106, 14);
		contentPane.add(label_1);
		
		paswordField_2 = new JTextField();
		paswordField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 pasword2 = paswordField_2.getText();
			}
		});
		paswordField_2.setColumns(10);
		paswordField_2.setBounds(198, 139, 150, 20);
		contentPane.add(paswordField_2);
		
		JLabel lblNewLabel_2 = new JLabel("R: ...");
		lblNewLabel_2.setBounds(60, 167, 288, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login = loginField.getText(); 
				pasword = paswordField.getText(); 
				pasword2 = paswordField_2.getText();
				if (login != null || pasword != null || pasword != pasword2 ) {
					System.out.println("pasword1:"+pasword+" pasword2:"+pasword2);	
					if (Main.stringCompare(pasword,pasword2)!=0 ) {
						
						 try {
								if (Main.getuserdb(login,pasword) != true) {
									Main.insertdb(login, pasword);
									new MainPanel().setVisible(true);
									setVisible(false); 
									
									}
								else {
									lblNewLabel_2.setText("R: Error ! login or pasword exist");
									}
							} catch (SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
										
					}else {
						System.out.println("R:"+Main.stringCompare(pasword,pasword2));
						lblNewLabel_2.setText("R: Error ! pasword !="+":" + pasword + ":" +pasword2);
					 }
					}
				else
					lblNewLabel_2.setText("R: Error ! date is null :" +login +":" + pasword + ":" +pasword2);
			}
		});
		btnNewButton.setBounds(110, 192, 106, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new LogIn().setVisible(true);
				setVisible(false); 
			}
		});
		btnNewButton_1.setBounds(259, 192, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
	}

}
