<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de doador</title>
<form method="post" action="cadastro_doador">
	<label>Nome: </label><input type="text" name="nome"></br>
	<label>CPF: </label><input type="text" name="cpf" ></br>
	<label>Endereço: </label><input type="text" name="endereco" ></br>
	<label>Email: </label><input type="text" name="email" ></br>
	<label>Telefone: </label><input type="text" name="telefone"></br>
	<label>Data Nascimento: </label><input type="text" name="data_nascimento" ></br>
	<label>Sexo: </label><input type="text" name="sexo"></br>
	<label>Senha: </label><input type="password" name="senha"></br>
	<input type="submit" value="Enviar">
	<input type="reset" value="Cancelar">
</form>

</head>
<body>

</body>
</html>