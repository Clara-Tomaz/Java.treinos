<%@page import="dao.UsuarioDAO"%>
<%@page import="modelo.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String nome = (String) session.getAttribute("usuarioSession");
	%>

	<h1>
		Bem vindo ao sistema!,<%=nome%>
	</h1>

	<div>Lista de usuarios</div>


	<div>
		<table border="1">
			<tr>
				<th>ID</th>
				<th>NOME</th>
				<th>USUARIO</th>
				<th colspan="2"></th>
			</tr>
			
			<%
			UsuarioDAO dao = new UsuarioDAO();
			List<Usuario> lista = new ArrayList<Usuario>();

			lista = dao.listar();
			
			for(Usuario usuario: lista){%>
			<tr>
			
			<td>
			<%=usuario.getId() %>
			
			</td>
			
			<td>
			<%=usuario.getNome() %>
			
			</td>
			
			<td>
			<%=usuario.getUsuario() %></td>
			
			<td>
			<a href="DELETE.JSP?id=<%=usuario.getId()%>">
			<img src=""    >
			</a>
			
			</td>
			</tr>
			
				<%
			}
			
			%>

		</table>
         <div>
	         <nav>
	         <ul>
	         <li> <a href="" ></a></li>
	         </ul>
	         
	         
	         </nav>
        </div>
        
        
        
        
        
        
        
	
</body>
</html>