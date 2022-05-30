
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AmigoOculto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        int NumeroParticipantes;
	        String nome, presente, continua;
	        Participante participante;
	        
	        List<Participante> nomes = new ArrayList<Participante>();
	        Random posição = new Random();
	        Scanner teclado = new Scanner(System.in);
	      
	        System.out.println("Quantos nomes deseja criar?");
	        	quantos = teclado .nex.Int();
                System.out.println("Quantas pessoas no sorteio?");
                numeroParticipantes = teclado.nextInt();
              
                for(int i = 0; i < numeroParticipantes; i++) {
                	participante = new Participante(); 
                	 System.out.println("digite o nome do particpante" + (i + 1));
                	 nome = teclado.next();
                	 
                	 System.out.println("digite o presente");
                	 presente = teclado.next();
                	 
                	 participante.setNome(nome);
                	 participante.setPresente(presente);
                	 
                	 nomes.add(participante);
                	 
                }
         
                System.out.println("Deseja fazer o sorteio agora?(s/n");
                continua = teclado.next();
                
                if (continua.equals("S"));{
                	System.out.println("O nome sorteado é " + nomes.get(posicao.nextInt(nomes.size())).getNome() + "presente"+ 
                			nomes.get(posicao.nextInt(nomes.size())).getNome() + "presente");
                }else
                	System.out.println("o sorteiro oi cancelado");
	}

}
