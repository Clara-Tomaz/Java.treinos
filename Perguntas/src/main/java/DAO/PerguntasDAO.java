package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Perguntas;


public class PerguntasDAO {
	Connection cnx = null;
	

	public List<Perguntas> listar(){
		List<Perguntas> listaDePerguntas = new ArrayList<Perguntas>();
		ResultSet rs = null;
		Perguntas pergunta = null;
		
		cnx = DAO.createConnection();
		
		String sql = "SELECT * FROM tb_pergunte";
		
		try {
			PreparedStatement ps = cnx.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				pergunta = new Perguntas();
				
				pergunta.setId(rs.getInt("id"));
				pergunta.setPergunta(rs.getString("pergunta"));
				pergunta.setRespostacerta(rs.getString("respostacerta"));
				pergunta.setRespostaerr1(rs.getString("respostaerr1"));
				pergunta.setRespostaerr2(rs.getString("respostaerr2"));
				
				listaDePerguntas.add(pergunta);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return listaDePerguntas;
	}


	public boolean consultarPerguntas(int idPerguntas) {
		// TODO Auto-generated method stub
		return false;
	}
}