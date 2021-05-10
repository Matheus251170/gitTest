package POO;

public class automovel {
	//declaração atributo de classe
	
	
	private String nomeProprietarie;
	private String modelo;
	private String placa;
	private int ano;
	
	//ciração metodo contrutor
	
	public automovel(String nomeProprietarie, String modelo, String placa, int ano)
	{
		this.nomeProprietarie = nomeProprietarie;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
	}
	
	
	//declaração dos demais métodos da classe
	
	public void imprimirInfo()
	{
		System.out.println(nomeProprietarie + " possui um(a) " + modelo + " com placa " + placa + " e ano " + ano);
	}


	public String getNomeProprietarie() {
		return nomeProprietarie;
	}


	public void setNomeProprietarie(String nomeProprietarie) {
		this.nomeProprietarie = nomeProprietarie;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
}
