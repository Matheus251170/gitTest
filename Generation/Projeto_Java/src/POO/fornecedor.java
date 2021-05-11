package POO;

public class fornecedor extends pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public fornecedor(String nome, String endereco, String cpf, int idade, int telefone, double valorCredito, double valorDivida)
	{
		super(nome, endereco, cpf, idade, telefone);
		
		this.valorDivida = valorDivida;
		this.valorCredito = valorCredito;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome do oper�rio: " + getNome() + "\nCPF: " + getCpf() + "\nEndere�o: " + getEndereco() + "\nIdade: " 
		+ getIdade() + "\nTelefone: " + getTelefone() + "\nValor de cr�dito produzido por " + getNome() + ": " + valorCredito + 
		"\nValor da divida: " + valorDivida);
		
	}
	
	public void validarCPf()
	{
		if(getCpf().length() != 11)
		{
			System.out.println("\n----CPF inv�lido----");
		}
		else 
		{
			System.out.println("----CPF v�lido----");
		}
	}
	
	public void obterSaldo()
	{
		double diferenca = valorCredito - valorDivida;
		System.out.println("\nO saldo do fornecedor � igual a: " + diferenca);
	}

}
