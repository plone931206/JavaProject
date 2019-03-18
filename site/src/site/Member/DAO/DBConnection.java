package site.Member.DAO;

import java.sql.*;

public class DBConnection {
	String Driver = "com.mysql.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/site";
	String ID = "root";
	String PW = "1234";
	static Connection connection = null;
	
	public DBConnection(){
		try {
			Class.forName(Driver);
			connection = DriverManager.getConnection(URL,ID,PW);			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

	public static void setConnection(Connection connection) {
		DBConnection.connection = connection;
	}

}
