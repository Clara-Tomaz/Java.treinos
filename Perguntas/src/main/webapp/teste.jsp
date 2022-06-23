<%@page import="DAO.PerguntasDAO"%>
<%@page import="modelo.Perguntas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href = "tabela.css">
<title>Tabela Perguntas</title>
</head>

<body>
<%String coisa=(String)session.getAttribute("PerguntasSession");%>

	<h2>
		Bem vindo ao sistema,
		<%=coisa %></h2>
<div class = "content">
	
	<div>
		<table border=1 class="rTable">
		
			

			<%
			PerguntasDAO dao = new PerguntasDAO();
			List<Perguntas> lista = new ArrayList<Perguntas>();
			
			lista = dao.listar();
			
			for(Perguntas perguntas: lista){%>
			
		
			
			<tr>
				<td  class="thead"><%=perguntas.getPergunta() %></td>

			</tr>
			
		   <tr>    
			<td class="tbody"><a href ="erro.jsp"><input type="button" value="<%=perguntas.getRespostaerr1()%>"/></a></td>

			</tr>


			<tr>
				
			<td class="tbody"><a href ="acerto.jsp"><input type="button" value="<%=perguntas.getRespostacerta()%>"/></a></td>
				
			</tr>
				<tr>
					<td class="tbody"><a href ="erro.jsp"><input type="button" value="<%=perguntas.getRespostaerr2()%>"/></a></td>
			</tr>

			<%
			}
			%>
			
		</table>
		<div>
			<nav>
				<ul>
					<li><a href="index.html">Logout</a></li>
				</ul>
			</nav>
		</div>
	</div>
	</div>
</body>
</html>