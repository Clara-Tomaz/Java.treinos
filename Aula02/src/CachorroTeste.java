
public class CachorroTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro um = new Cachorro();
		um.setTamanho("70");
		um.setCor("amarelo");
		um.setPeso(60);
		um.setNome("Lalau");
		
		Cachorro dois = new Cachorro();
		 dois.setTamanho("50");
			dois.setCor("roxo");
			dois.setPeso(10);
			dois.setNome("Laila");
			
		 Cachorro tres = new Cachorro ();
		 tres.setTamanho("40");
			tres.setCor("azul");
			tres.setPeso(25);
			tres.setNome("Richana");
			
		 Cachorro quatro = new Cachorro ();
		 quatro.setTamanho("10");
			quatro.setCor("rosa");
			quatro.setPeso(70);
			quatro.setNome("Bia");
			
			System.out.println("O Cachorro um tem a cor: " + um.getCor()+ " e o seu nome é : " +um.getNome() );
			
			System.out.println("O Cachorro dois tem a cor: " +dois.getCor()+ " e o seu nome é : " +dois.getNome() );
			
			System.out.println("Cachorro tres tem a cor: " + tres.getCor()+ " e o seu nome é : " +tres.getNome() );
			
			System.out.println("Cachorro quatro tem a cor: " + quatro.getCor()+ " e o seu nome é : " +quatro.getNome() );
			
			um.emitirSom();
			
			dois.emitirSom();
			
			tres.emitirSom();
			
			quatro.emitirSom();
			
	}

}
