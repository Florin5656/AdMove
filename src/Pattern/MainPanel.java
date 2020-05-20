package Pattern;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Cursor;
import javax.swing.JScrollPane;



public class MainPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	private static JPanel contentPane;
	static JTextArea textArea = new JTextArea();
	int g=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPanel frame = new MainPanel();
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
	public MainPanel() {
		setTitle("AdminMove");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 706, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		 contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setLayout(null);
		
		JButton btnSetings = new JButton("Settings");
		btnSetings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			    Decorator myDecorator = new Decorator();
			    
			    if (g==0) {
			    myDecorator.setClasicBG();	
			    g=1;
			    }else {
			    	myDecorator.setCustomBG();	
				    g=0;
			    }	
			}
		});
		btnSetings.setBounds(567, 11, 113, 23);
		contentPane.add(btnSetings);
		
		JButton btnCart = new JButton("Cart ");
		btnCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Builder myBuilder = new Builder();
			    try {
					myBuilder.play();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCart.setBounds(151, 11, 113, 23);
		contentPane.add(btnCart);
		
		JButton btnControl = new JButton("Control Panel");
		btnControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				   Facade myFacade = new Facade();
				    myFacade.play();
			}
		});
		btnControl.setBounds(10, 11, 113, 23);
		contentPane.add(btnControl);
		
		JButton btnMove = new JButton("Move");
		btnMove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator_command myIterator = new Iterator_command();
			    myIterator.getMove();
			}
		});
		btnMove.setBounds(10, 48, 113, 23);
		contentPane.add(btnMove);
		
		JButton btnStatActive = new JButton("Activ Move");
		btnStatActive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator_command myIterator = new Iterator_command();
			    try {
					myIterator.getActiveMove();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnStatActive.setBounds(10, 82, 113, 23);
		contentPane.add(btnStatActive);
		
		JButton btnStatInactive = new JButton("Inactiv Move");
		btnStatInactive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Iterator_command myIterator = new Iterator_command();
			    try {
					myIterator.getInactiveMove();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnStatInactive.setBounds(10, 116, 113, 23);
		contentPane.add(btnStatInactive);
		
		JButton btnMesage1 = new JButton("Mesage 1");
		btnMesage1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Prototype myPrototype = new Prototype();
				 myPrototype.mesage1();
			}
		});
		btnMesage1.setBounds(567, 48, 113, 23);
		contentPane.add(btnMesage1);
		
		JButton btnMesage2 = new JButton("Mesage 2");
		btnMesage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Prototype myPrototype = new Prototype();
				    myPrototype.mesage2();
			}
		});
		btnMesage2.setBounds(567, 82, 113, 23);
		contentPane.add(btnMesage2);
		
		JButton btbMesage3 = new JButton("Mesage 3");
		btbMesage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 Prototype myPrototype = new Prototype();
				    myPrototype.mesage3();
			}
		});
		btbMesage3.setBounds(567, 116, 113, 23);
		contentPane.add(btbMesage3);
		
		JButton btnCartFilm = new JButton("Cart Film");
		btnCartFilm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Builder myBuilder = new Builder();
			    try {
					myBuilder.getCartFilm();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnCartFilm.setBounds(290, 11, 113, 23);
		contentPane.add(btnCartFilm);
		
		JButton btnCartSerial = new JButton("Cart Serial");
		btnCartSerial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Builder myBuilder = new Builder();
			    try {
					myBuilder.getCartSerial();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnCartSerial.setBounds(424, 11, 113, 23);
		contentPane.add(btnCartSerial);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 //	new LogIn().setVisible(true);   
				setVisible(false);
			}
		});
		btnNewButton.setBounds(567, 351, 113, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add Move");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new AddMove().setVisible(true);
			}
		});
		
		btnNewButton_1.setBounds(10, 313, 113, 23);
		contentPane.add(btnNewButton_1);
		
		JButton button = new JButton("Delete Move");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					new DeleteMove().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		button.setBounds(10, 347, 113, 23);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBounds(151, 52, 386, 318);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 386, 318);
		panel.add(scrollPane);
		textArea.setFocusCycleRoot(true);
		scrollPane.setViewportView(textArea);
		textArea.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
		textArea.setRows(5);
		textArea.setEditable(false);
        textArea.setWrapStyleWord(true);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setForeground(Color.DARK_GRAY);
			
	}
	
	
	public static void seterText(String s) {
		textArea.append(s+"\n");
	}
	
	public static void seterColor(int i) {	
		if(i==1) {
			 textArea.setBackground(Color.LIGHT_GRAY);
			 textArea.setForeground(Color.DARK_GRAY);
			 contentPane.setBackground(Color.LIGHT_GRAY);
			
			}
		else {
			textArea.setBackground(Color.DARK_GRAY);
			textArea.setForeground(Color.LIGHT_GRAY);
			contentPane.setBackground(Color.DARK_GRAY);
			
			
			}
		
	}
	public static int stringCompare(String str1, String str2) 
	{ 

	    int l1 = str1.length(); 
	    int l2 = str2.length(); 
	    int lmin = Math.min(l1, l2); 

	    for (int i = 0; i < lmin; i++) { 
	        int str1_ch = (int)str1.charAt(i); 
	        int str2_ch = (int)str2.charAt(i); 

	        if (str1_ch != str2_ch) { 
	            return 0; 
	        } 
	    } 

	    if (l1 != l2) { 
	        return 0; 
	    } 

	    else { 
	        return 1; 
	    } 
	} 
}
