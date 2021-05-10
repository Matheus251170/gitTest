package POO;

public class produtoEletronico {

	/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto
	no console.*/
	
	private String nomeProduto;
	private double preco;
	private String marca;
	private String comprador;
	
	public produtoEletronico(String nomeProduto, double preco, String marca, String comprador)
	{
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.marca = marca;
		this.comprador = comprador;

	}
	
	public void imprimir()
	{
		System.out.println("Produto: " + nomeProduto + "\nPre�o: R$" + preco + "\nMarca: " + marca + "\nVendido para: " + comprador);
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
}
