package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtiliser {
	
	private final static String hostname = "jdbc:mysql://13.233.226.80:3306/kaushik_db";
	private final static String username = "kaushik";
	private final static String password = "kaushik";
	
	static Connection conn = null;
	
	public static Connection getConnection(){
		
		try{
			  Class.forName("com.mysql.jdbc.Driver");
              conn = DriverManager.getConnection(hostname,username,password);
		}
		catch(Exception ae){
			System.err.println(ae.getMessage());
		}
		
		return conn;
	}
	
}
