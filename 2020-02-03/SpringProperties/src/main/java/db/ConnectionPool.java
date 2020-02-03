package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ConnectionPool {
	//private static final int MAX_CONNECTIONS = 10;
	private ArrayList<Connection> connections = new ArrayList<Connection>();
	@Autowired
	private Environment env;
	
	private ConnectionPool() {
		
		try {
			Class.forName(env.getProperty("db.driver"));
			for (int i = 0; i < env.getRequiredProperty("db.max_connections", Integer.class); i++) {
				connections.add(DriverManager.getConnection(env.getProperty("db.url"), 
						env.getProperty("db.username"), env.getProperty("db.password")));
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
