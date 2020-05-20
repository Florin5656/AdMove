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
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class AddMove extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JPanel contentPane;
	private static JTextField TitleField;
	private static JTextField StockField;
	private static  JTextField QuantytiField;
	private static JTextField PriceField;
	private static Connection co;
	static JRadioButton ActiveRadioButton;
	JRadioButton InactiveRadioButton;
	private JLabel lblNewLabel_4;
	private static JTextField rezultField;
	private JButton exitButton;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddMove frame = new AddMove();
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
	public AddMove() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TitleField = new JTextField();
		TitleField.setBounds(174, 28, 144, 20);
		contentPane.add(TitleField);
		TitleField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Title");
		lblNewLabel.setBounds(95, 31, 46, 14);
		contentPane.add(lblNewLabel);
		
		StockField = new JTextField();
		StockField.setBounds(174, 69, 144, 20);
		contentPane.add(StockField);
		StockField.setColumns(10);
		
		QuantytiField = new JTextField();
		QuantytiField.setBounds(174, 111, 144, 20);
		contentPane.add(QuantytiField);
		QuantytiField.setColumns(10);
		
		PriceField = new JTextField();
		PriceField.setBounds(174, 150, 144, 20);
		contentPane.add(PriceField);
		PriceField.setColumns(10);
		
		JButton btnNewButton = new JButton("Add Move");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					setfilm();
					TitleField.setText("");
					StockField.setText("");
					QuantytiField.setText("");
					PriceField.setText("");
					rezultField.setText("move add");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					TitleField.setText("");
					StockField.setText("");
					QuantytiField.setText("");
					PriceField.setText("");
					rezultField.setText("erorr: move not add");
			
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(229, 208, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TitleField.setText("");
				StockField.setText("");
				QuantytiField.setText("");
				PriceField.setText("");
			}
		});
		btnNewButton_1.setBounds(95, 208, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tip");
		lblNewLabel_1.setBounds(95, 72, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Series");
		lblNewLabel_2.setBounds(95, 114, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price");
		lblNewLabel_3.setBounds(95, 153, 46, 14);
		contentPane.add(lblNewLabel_3);
		
	    ActiveRadioButton = new JRadioButton("Active Move");
		ActiveRadioButton.setSelected(true);
		ActiveRadioButton.setBounds(220, 177, 98, 24);
		contentPane.add(ActiveRadioButton);
		
		InactiveRadioButton = new JRadioButton("Inactive Move");
		InactiveRadioButton.setBounds(95, 178, 109, 23);
		contentPane.add(InactiveRadioButton);
		
		
		ButtonGroup group = new ButtonGroup();
        group.add(ActiveRadioButton);
        group.add(InactiveRadioButton);
        
        lblNewLabel_4 = new JLabel("Move status:");
        lblNewLabel_4.setBounds(95, 6, 69, 14);
        contentPane.add(lblNewLabel_4);
        
        rezultField = new JTextField();
        rezultField.setEditable(false);
        rezultField.setBounds(174, 3, 144, 20);
        contentPane.add(rezultField);
        rezultField.setColumns(10);
        
        exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setVisible(false);
        	}
        });
        exitButton.setBounds(335, 6, 89, 23);
        contentPane.add(exitButton);
        
	}
	
	public static void setfilm() throws SQLException {
		
		String query;
			try {
				Class.forName("org.sqlite.JDBC");
				co = DriverManager.getConnection(
						"jdbc:sqlite: /../sqlite/filename.db");
			}catch(Exception e){
				System.out.println(e.getMessage());
				}
		         if ( ActiveRadioButton.isSelected())
			     query = "INSERT INTO activemove(namemove, stok, quantity ,price) " +
					"VALUES('" + TitleField.getText() + "','" 
			    		 		+ StockField.getText() + "','" 
			    		 		+ QuantytiField.getText()  + "','" 
			    		 		+ PriceField.getText() + "')";
		        else
		        	query = "INSERT INTO inactivemove(namemove, stok, quantity ,price) " +
							"VALUES('" + TitleField.getText() + "','" 
					    		 		+ StockField.getText() + "','" 
					    		 		+ QuantytiField.getText()  + "','" 
					    		 		+ PriceField.getText() + "')";
			     
				Statement statement = co.createStatement();
				statement.executeUpdate(query);
				
				
		co.close();
}
	
}
