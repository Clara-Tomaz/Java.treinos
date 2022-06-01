package Animais;

public class Animal {
	
private int tamanho;
private String cor;
private double peso;
private String nome;
private String emitirSom;
	
public int getTamanho() {
	return tamanho;
}

public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}


public String getCor() {
	return cor;
}

public void setCor(String cor) {
	this.nome = nome;
}

public double getPeso() {
return peso;
}

public void setPeso(double peso) {
	this.peso=peso;
}

 public String getNome() {
	 return nome;
 }

 public void setNome(String nome) {
	 this.nome=nome;
 }
 
 public String getEmitirSom() {
	 return emitirSom;
 }

 public void setEmitirSom(String emitirSom) {
	 this.emitirSom=emitirSom;
 }
 
 
 public String emitirSom() {
	 return"miau...";
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}
