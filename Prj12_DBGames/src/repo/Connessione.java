package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private String URL = "jdbc:mysql://localhost:3306/fintech";
	private String USER = "root";
	private String PASS = "";
	
	private Connection conn;
	
	public Connection getConn() {
		if(this.conn==null) {
			this.connetti();
		}
		
		return this.conn;
		
	}
	
	private void connetti() {
		
		try {
			conn=DriverManager.getConnection(URL, USER, PASS);
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore" + e.getMessage());
		}
		
	}
	
}
