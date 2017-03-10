package teste;

import bean.doadorBean;
import dao.doadorDAO;

public class TesteDoador {
	
	public static void main (String[] args){
		testeDeletarCadastro();
	}
	
	public static void testeCadastro(){
		doadorBean user = new doadorBean();
		user.setNome("Arthur");
		user.setCpf("080812312");
		user.setSenha("1234");
		user.setEndereco("rua teste");
		user.setEmail("teste@gmail.com");
		user.setTelefone("8288787323");
		user.setDataNascimento("10/10/2010");
		user.setSexo("masculino");
		
		doadorDAO doador = new doadorDAO();
		doador.criarDoador(user);
	}
	
	public static void testeAlterarCadastro(){
		doadorBean user = new doadorBean();
		user.setNome("Neftali");
		user.setCpf("080812312");
		user.setSenha("4321");
		user.setEndereco("rua teste112");
		user.setEmail("teste@gmail.com");
		user.setTelefone("8288787323");
		user.setDataNascimento("10/10/2010");
		user.setSexo("masculino");
		
		doadorDAO doador = new doadorDAO();
		doador.alterarDoador(user);
	}
	
	public static void testeDeletarCadastro(){
		doadorBean user = new doadorBean();
		user.setId(3);
		
		doadorDAO doador = new doadorDAO();
		doador.deletarDoador(user);
	}
}
