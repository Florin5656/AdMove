package Cart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Interface.Item;
import Pattern.MainPanel;

public class Cart {
	private static Connection co;
	 private List<Item> items = new ArrayList<Item>();	

	   public void addItem(Item item){
	      items.add(item);
	   }

	   public float getCostFilm() throws ClassNotFoundException, SQLException{
	      float cost = 0.0f;
	      Class.forName("org.sqlite.JDBC");
			
			co = DriverManager.getConnection(
					"jdbc:sqlite: /../sqlite/filename.db");
			
			
			String query = "SELECT * FROM inactivemove;";
			Statement statement = co.createStatement();
			ResultSet rs = statement.executeQuery(query);
			while (rs.next()) {
					if(MainPanel.stringCompare(rs.getString("stok"),"film")==1)
	    			cost= cost+ rs.getFloat("price"); 
	    			}
			 try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 	String query2 = "SELECT * FROM activemove;";
				Statement statement2 = co.createStatement();
				ResultSet rs2 = statement2.executeQuery(query2);
				while (rs2.next()) {
					if(MainPanel.stringCompare(rs2.getString("stok"),"film")==1)
		    			cost= cost+ rs2.getFloat("price"); 
		    			}
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			
			co.close();	
	      return cost;
	   }
	   public float getCostSerials() throws ClassNotFoundException, SQLException{
		      float cost = 0.0f;
		      Class.forName("org.sqlite.JDBC");
				
				co = DriverManager.getConnection(
						"jdbc:sqlite: /../sqlite/filename.db");
				
				
				String query = "SELECT * FROM inactivemove;";
				Statement statement = co.createStatement();
				ResultSet rs = statement.executeQuery(query);
				while (rs.next()) {
						if(MainPanel.stringCompare(rs.getString("stok"),"serial")==1)
		    			cost= cost+ rs.getFloat("price"); 
		    			}
				 try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				 	String query2 = "SELECT * FROM activemove;";
					Statement statement2 = co.createStatement();
					ResultSet rs2 = statement2.executeQuery(query2);
					while (rs2.next()) {
						if(MainPanel.stringCompare(rs2.getString("stok"),"serial")==1)
			    			cost= cost+ rs2.getFloat("price"); 
			    			}
					 try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				co.close();	
		      return cost;
		   }
	   public float getCost() throws ClassNotFoundException, SQLException{
		   float cost =0.0f;
		
		   cost = getCostFilm() +  getCostSerials();
		   
		   return cost;
	   }
	   
	}