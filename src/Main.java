//import Pattern.MainPanel;
import java.sql.*;

import Pattern.MainPanel;
public class Main {
	
	private static Connection co;

	public static void main(String[] args) throws Exception{
		
		 new LogIn().setVisible(true);
		 new ServerPanel().setVisible(false);
		 new MainPanel().setVisible(false);
		 
	} 

	public static void opendb() {
		try {
			Class.forName("org.sqlite.JDBC");
			co = DriverManager.getConnection(
					"jdbc:sqlite: /../sqlite/adfilm.db");
			System.out.println("Connected adfilm.db");
		}catch(Exception e){
			System.out.println(e.getMessage());
			}
	} 
	
	public static boolean insertdb(String name ,String pasword) {
		
		try {
			opendb();
			String query = "INSERT INTO users (name, pasword) " +
				"VALUES('" + name + "','" + pasword + "')";
			Statement statement = co.createStatement();
			statement.executeUpdate(query);
			System.out.println("Rows added");
			closedb();
			return true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
public static boolean getuserdb(String login ,String pasword) throws SQLException {
		
			boolean a = true;
			opendb();
			String query = "SELECT * FROM users ";
			Statement statement = co.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while (rs.next()) {
				
				String thislogin = rs.getString("name") ;
				String thispasword = rs.getString("pasword");
				
                if ( stringCompare(login, thislogin )== 1  && stringCompare( pasword, thispasword)==1) {
        			a = true;
        			
        			   break;	   
        			}else {
        			a = false;
        			
        			}
            }
			closedb();
			System.out.println("return: "+ a); 
			return a;
	}
	
	
	public static void closedb() {
		try {
			co.close();
			System.out.println("Disconnected adfilm.db");
		}catch(Exception e){
			System.out.println(e.getMessage());
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
