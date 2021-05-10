package POO;

public class cliente {
	
	/*Crie uma classe cliente e apresente os atributos e métodos referentes
	esta classe, em seguida crie um objeto cliente, defina as instancias deste
	objeto e apresente as informações deste objeto no console.*/
	
	private String nome;
	private int idade;
	private String pedido;
	
	
	public cliente(String nome, String pedido, int idade)
	{
		this.nome = nome;
		this.pedido = pedido;
		this.idade = idade;
	}
	
	public void imprimir()
	{
		System.out.println("Cliente: " + nome + "\nIdade: " + idade + "\nSolicitou o produto: " + pedido);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}
	
	

}
