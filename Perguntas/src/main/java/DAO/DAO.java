package DAO;

import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DAO {

	public static Connection createConnection() {
		String url, user, password; 
		
		Connection cnx= null;
		
	
		
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		url = "jdbc:mysql://localhost:3306/projeto_int";
		
		user = "root";

		password = "";
		cnx = DriverManager.getConnection(url, user, password);

} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

return cnx;


}
}