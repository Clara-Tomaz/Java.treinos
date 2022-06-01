package Zoologico;

import Animais.Animal;
import Animais.Gato;
import Animais.Leao;
import Animais.Tatu;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Gato gato= new Gato();
Leao leao= new Leao();
Tatu tatu= new Tatu();

gato.setCor("cinza");
gato.setPeso(3);
gato.setNome("Neve");
gato.setTamanho(50);



leao.setCor("Amarelo");
leao.setPeso(50);
leao.setTamanho(90);
leao.setNome("Fabricio");

tatu.setCor("marrom");
tatu.setPeso(1);
tatu.setTamanho(10);
tatu.setNome("Roliça");

System.out.println(gato.getNome() + "," + gato.brincar());
System.out.println(leao.getNome() + ","+ leao.emitirSom() );
System.out.println(tatu.getNome()+","+ tatu.emitirSom());

Animal[] animais = new Animal[3];

animais[0]= new Leao();
animais[1] = new Gato();
animais[2]= new Tatu();

for (Animal x: animais) {
	System.out.println(x.emitirSom());
}
































	}

}
