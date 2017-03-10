package dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.doadorBean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

public class doadorDAO {
	
	private static Connection con = ConexaoMySQL.conexaoMySQL();
	
	public void criarDoador(doadorBean doador){
		
		String sql = "INSERT INTO doadores (nome,cpf,senha,endereco,email,telefone,data_nascimento,sexo) values (?,?,?,?,?,?,?,?)";
		try{
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, doador.getNome());
			preparador.setString(2, doador.getCpf());
			preparador.setString(3, doador.getSenha());
			preparador.setString(4, doador.getEndereco());
			preparador.setString(5, doador.getEmail());
			preparador.setString(6, doador.getTelefone());
			preparador.setString(7, doador.getDataNascimento());
			preparador.setString(8, doador.getSexo());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Doador criado com sucesso!");
		}catch (SQLException e) {
			System.out.println("Erro no sql");
		}
	}
	
	public  void alterarDoador(doadorBean doador){
		
		String sql = "UPDATE doadores SET nome = ? , cpf = ? , senha = ? , endereco = ? , email = ? , telefone = ? , data_nascimento = ? , sexo = ? where id = ? ";
		try{
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, doador.getNome());
			preparador.setString(2, doador.getCpf());
			preparador.setString(3, doador.getSenha());
			preparador.setString(4, doador.getEndereco());
			preparador.setString(5, doador.getEmail());
			preparador.setString(6, doador.getTelefone());
			preparador.setString(7, doador.getDataNascimento());
			preparador.setString(8, doador.getSexo());
			preparador.setInt(9, doador.getId());
			
			preparador.execute();
			preparador.close();
			
			System.out.println("Doador alterado com sucesso!");
		}catch (SQLException e) {
			System.out.println("Erro no sql");
		}
	}
	
	public  void deletarDoador(doadorBean doador){
		
		String sql = "DELETE FROM doadores where id = ? ";
		try{
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setInt(1, doador.getId());			
			preparador.execute();
			preparador.close();
			
			System.out.println("Doador deletado com sucesso!");
		}catch (SQLException e) {
			System.out.println("Erro no sql");
		}
	}
	
public  List<doadorBean> listarDoadores(doadorBean doador){
		
		String sql = "SELECT * FROM doadores";
		List<doadorBean> lista = new ArrayList<doadorBean>();
		try{
			PreparedStatement preparador = con.prepareStatement(sql);
			ResultSet resultados = preparador.executeQuery();
			
			while(resultados.next()){
				
				doadorBean user = new doadorBean();
				user.setId(resultados.getInt("id"));
				user.setNome(resultados.getString("nome"));
				user.setCpf(resultados.getString("cpf"));
				user.setSenha(resultados.getString("senha"));
				user.setEndereco(resultados.getString("endereco"));
				user.setEmail(resultados.getString("email"));
				user.setTelefone(resultados.getString("telefone"));
				user.setDataNascimento(resultados.getString("data_nascimento"));
				user.setSexo(resultados.getString("sexo"));
				lista.add(user);
			}
			preparador.execute();
			preparador.close();
		}catch (SQLException e) {
			System.out.println("Erro no sql");
		}
		return lista;
		
	}
}
