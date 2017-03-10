package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoMySQL{
   
    
    public static Connection conexaoMySQL() {
        Connection conexao = null;
        String tipoBanco = "jdbc:mysql";
        String endereco = "localhost:3306";
        String nomeBanco = "agencia";
        String nomeUsuario = "root";
        String senha = "";
    	try {
    		try {
				Class.forName ("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Erro com o drive do Mysql");
				e.printStackTrace();
			}
            conexao = DriverManager.getConnection(tipoBanco + "://" + endereco + "/" + nomeBanco, nomeUsuario, senha);                       
        }catch (SQLException e) {
            System.out.println("Erro na conexao com o banco de dados");
        }
    	return conexao;
    }
}

