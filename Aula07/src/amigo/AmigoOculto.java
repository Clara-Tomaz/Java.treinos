package amigo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SuppressWarnings("unused")
public class AmigoOculto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nomes = new ArrayList<String>();
		Random posicao = new Random();
		
		nomes.add("Arian");
		nomes.add("Nicolas");
		nomes.add("Matheus");
		nomes.add("Marcus");
		nomes.add("Jo�o");
		nomes.add("Beatriz");
		nomes.add("Henrique");
		
		System.out.println("O nome � " + nomes.get(posicao.nextInt(nomes.size())));
	}

}
