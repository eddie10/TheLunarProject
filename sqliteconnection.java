import java.sql.*;
import javax.swing.*;
public class sqliteconnection {

	Connection conn=null;
	
	
	public static Connection dbConnector() {
	 try {
			 Class.forName("org.sqlite.JDBC");
			 Connection conn =DriverManager.getConnection("jdbc:sqlite:/Users/myuniverese/Desktop/new db/school.sqlite");
			 
              System.out.println("connection successful");
			 return conn;
			 
	 }catch(Exception e) {
	    	System.out.println("doesnt work");
	    	return null;
	    }
	 
	 
	 
	 
	 
 }
}
