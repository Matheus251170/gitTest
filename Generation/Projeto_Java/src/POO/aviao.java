package POO;

public class aviao {
	
	private String nomeViajante;
	private int idade;
	private String paisNativo;
	private String paisViagem;
	
	public aviao(String nomeViajante, int idade, String paisNativo, String paisViagem)
	{
		this.nomeViajante = nomeViajante;
		this.idade = idade;
		this.paisNativo = paisNativo;
		this.paisViagem = paisViagem;
	}
	
	public void imprimir()
	{
		System.out.println("Viajante: " + nomeViajante + "\nIdade: " + idade + "\nPaís de origem: " + paisNativo + "\nPaís de destino: " + paisViagem);
	}

	public String getNomeViajante() {
		return nomeViajante;
	}

	public void setNomeViajante(String nomeViajante) {
		this.nomeViajante = nomeViajante;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPaisNativo() {
		return paisNativo;
	}

	public void setPaisNativo(String paisNativo) {
		this.paisNativo = paisNativo;
	}

	public String getPaisViagem() {
		return paisViagem;
	}

	public void setPaisViagem(String paisViagem) {
		this.paisViagem = paisViagem;
	}
	
	

}
