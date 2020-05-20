package Pattern;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class DeleteMove extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	private static JTextField titleField;
	private static JTextField textField_1;
	private static Connection co;
	
	static JRadioButton ActiveRadioButton;
	JRadioButton InactiveRadioButton;
	private JButton exitButton;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteMove frame = new DeleteMove();
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
	public DeleteMove() throws SQLException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		titleField = new JTextField();
		titleField.setBounds(225, 86, 134, 20);
		contentPane.add(titleField);
		titleField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setBounds(102, 89, 46, 14);
		contentPane.add(lblNewLabel);
		
		 ActiveRadioButton = new JRadioButton("Active Move");
		 ActiveRadioButton.setBounds(102, 140, 109, 23);
		 ActiveRadioButton.setSelected(true);
		 contentPane.add(ActiveRadioButton);
		
		InactiveRadioButton = new JRadioButton("Inactive Move");
		InactiveRadioButton.setSelected(true);
		InactiveRadioButton.setBounds(225, 142, 134, 24);
		contentPane.add(InactiveRadioButton);
		
		ButtonGroup group = new ButtonGroup();
        group.add(ActiveRadioButton);
        group.add(InactiveRadioButton);
		
		JButton btnNewButton = new JButton("Delete Move");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					deletefilm();
					titleField.setText(" ");
				
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					titleField.setText(" ");
					textField_1.setText("Erorr! not delete film");
					e1.printStackTrace();
				}
		
			}
		});
		btnNewButton.setBounds(236, 173, 123, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				titleField.setText("");
			}
		});
		btnNewButton_1.setBounds(102, 173, 97, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(225, 43, 133, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Move Status");
		lblNewLabel_1.setBounds(102, 46, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		exitButton.setBounds(161, 11, 89, 23);
		contentPane.add(exitButton);
		
        
	}
	public static void deletefilm() throws SQLException{
		
	String query;
	try {
		Class.forName("org.sqlite.JDBC");
		co = DriverManager.getConnection(
				"jdbc:sqlite: /../sqlite/filename.db");
	}catch(Exception er){
		System.out.println(er.getMessage());
		}
         if ( ActiveRadioButton.isSelected())
        	 query = "SELECT * FROM activemove ";
         else
        	 query = "SELECT * FROM inactivemove ";
         
         	Statement statement = co.createStatement();
			ResultSet rs = statement.executeQuery(query);
			textField_1.setText(titleField.getText());
			while (rs.next()) {
					
                if ( MainPanel.stringCompare(rs.getString("namemove") , titleField.getText() )== 1) {
                	   query = "DELETE FROM users WHERE id " + rs.getString("id");
                		textField_1.setText("Move delete");
        			   break;	
        			   }   
                System.out.println(rs.getString("namemove"));
        			
            }
			
			co.close();

}
	
	
	

}
