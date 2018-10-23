package br.com.cursojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoUtils {
	
	private static final String USER = "postgres";
	private static final String PASSWORD = "dbpass";
	private static final String URL = "jdbc:postgresql://localhost:5432/curso";
//	static {
//		try {
//			Class.forName("org.postgresql.Driver");
//		} catch (ClassNotFoundException e) {
//			System.out.println("Não foi possível carregar o driver");
//		}
//	}
	private static Connection connection;
	
	public static Connection getConnection() throws SQLException {
		if(connection == null || connection.isClosed()) {
			try {
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				System.out.println("Não foi possivel criar uma conexão com banco de dados");
				throw e;
			}
		}return connection;
	}
		public static void main(String[] args) throws SQLException {
			Connection con = getConnection();
			if(con!=null) {
				System.out.println("Teste de Conexão realizado com sucesso!");
				con.close();
			}else {
				System.out.println("Não foi possível criar uma conexão com o banco[:(]");
			}
		}

}
