package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class ConnectionPool {
	private static final int MAX_CONNECTIONS = 10;
	private ArrayList<Connection> connections = new ArrayList<Connection>();
	
	public ConnectionPool() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			for (int i = 0; i < MAX_CONNECTIONS; i++) {
				connections.add(DriverManager.getConnection("jdbc:mysql://localhost:3306/project1?serverTimezone=UTC", "root", "1234"));
			}
		} catch( ClassNotFoundException | SQLException ex) {
			System.out.println("ERROR! " + ex.getMessage());
		}
	}
	
	public synchronized Connection getConnection() {
		
		while(connections.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		Connection con = connections.get(0);
		connections.remove(con);
		return con;
	}
	
	public synchronized void restoreConnection(Connection connection) {
		connections.add(connection);
		notify();
	}
	
}
