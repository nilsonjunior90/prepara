package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import org.postgresql.Driver;

public class Conexao {
	private String url;
	private String usuario;
	private String senha;
	
	private Connection con;
	
	
	public Conexao(){
		url = "jdbc:postgresql://localhost:5432/db_prepara";
		usuario = "postgres";
		senha = "root";
		
		/**
		try {
			//Class.forName("org.postgresql.Driver");
			
			DriverManager.registerDriver(new org.postgresql.Driver());
			
			con = DriverManager.getConnection(url,usuario,senha);
			
			System.out.println("Conexão OK");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		**/
	}
	
	
	public Connection Factory(){
		url = "jdbc:postgresql://localhost:5432/db_prepara";
		usuario = "postgres";
		senha = "root";
		
		try {
			//Class.forName("org.postgresql.Driver");
			
			DriverManager.registerDriver(new org.postgresql.Driver());
			
			con = DriverManager.getConnection(url,usuario,senha);
			
			System.out.println("Factory -- Conexão OK");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con; 
	}
}
