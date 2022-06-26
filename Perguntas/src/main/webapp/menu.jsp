<%@page import="DAO.PerguntasDAO"%>
<%@page import="modelo.Perguntas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<link rel="stylesheet" href="tabela.css">
</head>
<body>
	<%String coisa = (String)session.getAttribute("PerguntasSession");%>

	<h2>
		Bem vindo ao sistema,
		</h2>

	<div >
		<h2>Lista de Perguntas</h2>
	</div>
	<div>
		<table border=1  class="rTable">
		<thead>
			

			<%
			PerguntasDAO dao = new PerguntasDAO();
			List<Perguntas> lista = new ArrayList<Perguntas>();
			
			lista = dao.listar();
			
			for(Perguntas perguntas: lista){%>
			<tr>
				<td><%=perguntas.getPergunta() %></td>
			</thead>
<tbody>
			</tr>


		   <tr>    
			<td><a href ="erro.jsp"><input type="button" value="<%=perguntas.getRespostaerr1()%>"/></a></td>

			</tr>


			<tr>
				
			<td><a href ="acerto.jsp"><input type="button" value="<%=perguntas.getRespostacerta()%>"/></a></td>
				
			</tr>
				<tr>
					<td><a href ="erro.jsp"><input type="button" id="container" value="<%=perguntas.getRespostaerr2()%>"/></a></td>
			</tr>


			<%
			}
			%>
		</table>
		</tbody>
		<div>
			<nav>
				<ul>
					<li><a href="index.html">Logout</a></li>
				</ul>
			</nav>
		</div>
	</div>
</body>
</html>