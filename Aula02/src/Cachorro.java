
public class Cachorro {
	private String cor, tamanho , nome;
	private int peso;
	
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String getTamanho() {
		return tamanho;
	}
	
	public void setTamanho (String tamanho) {
		this.tamanho = tamanho;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	void emitirSom() {
		if(peso >60) {
			System.out.println("woof woof");
		}else if (peso < 14) {
			System.out.println("Ruf Ruf!");
		}else {    
			System.out.println("Yip Yip");
		}
	}
	
}
