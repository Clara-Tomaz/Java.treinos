package servico;

import DAO.PerguntasDAO;


public class servico {
	PerguntasDAO perguntas  = new PerguntasDAO();
			
			public boolean consultar(String id) {
				int idPerguntas;
				
				idPerguntas = Integer.parseInt(id);
				
				return perguntas.consultarPerguntas(idPerguntas);
			}
		}



