package servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.doadorDAO;
import bean.doadorBean;

/**
 * Servlet implementation class cadastro_doador
 */
@WebServlet("/cadastro_doador")
public class CadastroDoador extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    
	public CadastroDoador() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
		String nome = req.getParameter("nome");
		String cpf = req.getParameter("cpf");
		String senha = req.getParameter("senha");
		String endereco = req.getParameter("endereco");
		String email = req.getParameter("email");
		String telefone = req.getParameter("telefone");
		String data_nascimento = req.getParameter("data_nascimento");
		String sexo = req.getParameter("sexo");
		
		
		doadorBean user = new doadorBean();
		user.setNome(nome);
		user.setCpf(cpf);
		user.setSenha(senha);
		user.setEndereco(endereco);
		user.setEmail(email);
		user.setTelefone(telefone);
		user.setDataNascimento(data_nascimento);
		user.setSexo(sexo);
		
		doadorDAO doador = new doadorDAO();
		doador.criarDoador(user);
		
		
	}

}
