package POO;

public class pessoa {
	
	private String nome;
	private String endereco;
	private String cpf;
	private int telefone;
	private int idade;
	
	
	//criação dos construtores
	
	public pessoa(String nome, String endereco, String cpf, int telefone, int idade)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
		this.telefone = telefone;
	}
	
	
	
	//metodos
	
	public void validarCPF()
	{
		if(getCpf().length() != 11)
		{
			System.out.println("\n----CPF inválido----");
		}
		else 
		{
			System.out.println("----CPF válido----");
		}
	}
	
	
	
	//getters and setters

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
