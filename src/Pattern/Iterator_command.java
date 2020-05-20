package Pattern;

import java.sql.*;
import Execute.Broker;
import Stock.AtiveStock;
import Stock.InactiveStock;
import Stock.Stock;
import Execute.NameRepository;
import Interface.IIterator;

public class Iterator_command {
	private static Connection co;
	
	 public void CommandFunction() {
		 
		 Stock abcdStock = new Stock("NCIS",40); 
		 InactiveStock InactiveStockOrder = new InactiveStock(abcdStock);
	     Broker broker = new Broker();
	     broker.takeOrder(InactiveStockOrder);
	 
	     broker.placeOrders();
	       
	      Stock abcdStock1 = new Stock("Jacklie",1); 
	      AtiveStock AcivStockOrder = new AtiveStock(abcdStock1);
	      Broker broker1 = new Broker();
	      broker1.takeOrder(AcivStockOrder);
	  
	      broker1.placeOrders();
	 }
	 
 public void getActiveMove() throws ClassNotFoundException, SQLException {
	 Class.forName("org.sqlite.JDBC");
		
		co = DriverManager.getConnection(
				"jdbc:sqlite: /../sqlite/filename.db");
		System.out.println("Connected filename.db");
		
		String query = "SELECT * FROM activemove;";
		Statement statement = co.createStatement();
		ResultSet rs = statement.executeQuery(query);
		 MainPanel.seterText("ActivMove: ");
		while (rs.next()) {
           
    			System.out.println("ActivMove: "
    					+rs.getString("namemove") 
    					+":" + rs.getString("stok")
    					//+":" + rs.getInt("quantity")
    					+":" + rs.getInt("price")); 
    			 MainPanel.seterText(rs.getString("namemove") 
     					+":" + rs.getString("stok")
     					//+":" + rs.getInt("quantity")
     					+":" + rs.getInt("price")+"$"); 
    			}
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		co.close();
	 }
 public void getInactiveMove() throws ClassNotFoundException, SQLException {
	 Class.forName("org.sqlite.JDBC");
		
		co = DriverManager.getConnection(
				"jdbc:sqlite: /../sqlite/filename.db");
		System.out.println("Connected filename.db");
		
		String query = "SELECT * FROM inactivemove;";
		Statement statement = co.createStatement();
		ResultSet rs = statement.executeQuery(query);
		MainPanel.seterText("InactivMove: ");
		while (rs.next()) {
           
    			System.out.println("InactivMove: "
    					+ rs.getString("namemove") 
    					+":" + rs.getString("stok")
    					//+":" + rs.getInt("quantity")
    					+":" + rs.getInt("price")); 
    			
    			 MainPanel.seterText(rs.getString("namemove") 
     					+":" + rs.getString("stok")
     					//+":" + rs.getInt("quantity")
     					+":" + rs.getInt("price")+"$"); 
    			}
		 try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		co.close();
	 }
 public void getMove()  {
	 try {
		getActiveMove();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		getInactiveMove();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 }
 	
	 public void IteratorFuncrion() {
		    
	      NameRepository namesRepository = new NameRepository();
	      int i=1;
	      for(IIterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	        
	         System.out.println("Move " + i + ": " + name);
	         MainPanel.seterText("Move " + i + ": " + name);
	         i++;
	      } 
	      try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	 }
}
