package POO.Heranca_ex1;

public class animal {

	private String nome;
	private int idade;
	private String som;
	private String raca;
	
	
	public animal(String nome, int idade, String som, String raca)
	{
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.som = som;
	}

	
	
	//getters and setters
	
	public String getNome() 
	{
		return nome;
	}


	public void setNome(String nome) 
	{
		this.nome = nome;
	}


	public int getIdade() 
	{
		return idade;
	}


	public void setIdade(int idade) 
	{
		this.idade = idade;
	}
	
	
	public String getRaca() 
	{
		return raca;
	}
	
	public void setRaca (String raca)
	{
		this.raca = raca;
	}



	public String getSom() {
		return som;
	}



	public void setSom(String som) {
		this.som = som;
	}
}
