package POO;

public class empregadoHeranca extends pessoa {
	
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	
	public empregadoHeranca(String nome, String cpf, String endereco, int telefone, int idade,
							float salarioBase, float imposto, int codigoSetor)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.imposto = imposto;
		this.salarioBase = salarioBase;
	}
	
	public void imprimir()
	{
		System.out.println("\nNome do funcionário: " + getNome() + "\nCPF: " + getCpf() + "\nEndereço: " + getEndereco() + "\nIdade: " 
		+ getIdade() + "\nTelefone: " + getTelefone() + "\nCodigo do setor: " + codigoSetor + "\nSalário: " + salarioBase 
		+ "\nImpostos sobre o salário: " + imposto);
		
	}
	
	public void calcuSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto / 100));
		
		System.out.println("\nO salário total a ser recebido pelo funcionário " + getNome() + " é de: R$" + salarioTotal);
	}
	
	
	
	//getters and setters
	
	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	
	
}
