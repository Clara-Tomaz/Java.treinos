package controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAO.DAO;
import DAO.PerguntasDAO;
import modelo.Perguntas;

public class PerguntasServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PerguntasServelet() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Perguntas> lista = new ArrayList<Perguntas>();
		
		HttpSession session= request.getSession();
		
		PerguntasDAO dao = new PerguntasDAO();
		
		lista = dao.listar();
		
		if(lista.size() > 0) {
			session.setAttribute("lista", lista);
			((HttpServletResponse) response).sendRedirect("menu.jsp");
		} else {
			response.sendRedirect("erro.jsp");
		}
	}

	}