
public class AppString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pelicano[] filhotes = new Pelicano[3];

		Pelicano p1 = new Pelicano();
		Pelicano p2 = new Pelicano();

		p1.setCor("branco");
		p1.setPeso(45);

		p1.setCor("rosa");
		p2.setPeso(60);

		filhotes[0] = p1;
		filhotes[1] = p2;
		filhotes[2] = new Pelicano();

		filhotes[2].setCor("preto");
		filhotes[2].setPeso(90);

		System.out.println(filhotes[0].getCor());
		filhotes[2].voar();

		for(Pelicano exemplo: filhotes) {
			System.out.println("O pelicano tem a cor : " + exemplo.getCor());
		}
	}

}
