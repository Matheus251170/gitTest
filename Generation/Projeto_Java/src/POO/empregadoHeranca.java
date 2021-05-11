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
		System.out.println("\nNome do funcion�rio: " + getNome() + "\nCPF: " + getCpf() + "\nEndere�o: " + getEndereco() + "\nIdade: " 
		+ getIdade() + "\nTelefone: " + getTelefone() + "\nCodigo do setor: " + codigoSetor + "\nSal�rio: " + salarioBase 
		+ "\nImpostos sobre o sal�rio: " + imposto);
		
	}
	
	public void calcuSalario()
	{
		double salarioTotal = salarioBase - (salarioBase * (imposto / 100));
		
		System.out.println("\nO sal�rio total a ser recebido pelo funcion�rio " + getNome() + " � de: R$" + salarioTotal);
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
