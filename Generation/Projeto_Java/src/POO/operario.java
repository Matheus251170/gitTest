package POO;

public class operario extends pessoa {
	
	private double valorProducao;
	private double comissao;
	
	public operario(String nome, String endereco, String cpf, int idade, int telefone, double valorProducao, double comissao)
	{
		super(nome, endereco, cpf, idade, telefone);
		
		this.comissao = comissao;
		this.valorProducao = valorProducao;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome do operário: " + getNome() + "\nCPF: " + getCpf() + "\nEndereço: " + getEndereco() + "\nIdade: " 
		+ getIdade() + "\nTelefone: " + getTelefone() + "\nValor monetário produzido por " + getNome() + ": " + valorProducao + 
		"\nValor da comissão: " + comissao + "%");
		
	}
	
	public void calcComissao()
	{
		double vlr_total = valorProducao + (valorProducao * (comissao/100));
		
		System.out.println("\nO valor total a ser recebido pelo operario " + getNome() + " é: " + vlr_total);
	}

	

	//getters and setters

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
		
	
	

}
