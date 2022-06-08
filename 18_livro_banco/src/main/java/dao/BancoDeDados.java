package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class BancoDeDados {

	public static Connection Conectar() {
		Connection connection = null;
		
		String servidor = "jdbc:mysql://localhost/ICARROS";
		
		String usuario = "root";
		String senha = "root";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(servidor, usuario, senha);			
		} catch (Exception e) {
			System.err.print("Error ao conectar: " + e.getMessage());
		}	
		
		return connection;
	}	
}
