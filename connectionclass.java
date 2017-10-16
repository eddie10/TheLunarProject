import java.sql.*;
public class connectionclass {
public static Connection dbconnector() {
	try {
		
		Class.forName("org.sqlite.JDBC");
		Connection conn =DriverManager.getConnection("jdbc:sqlite:school.sqlite");
				return conn;
	} catch (Exception e) {
		return null;
	}
	
	
	
	
	
	
}
}
