package POO.Heranca_ex1;

public class cachorro extends animal{
	
	
	public cachorro(String nome, int idade, String som, String raca)
	{
		super(nome, idade, som, raca);
		
	}
	
	public void movimento()
	{
		System.out.println("\nTipo de movimento: Correr");
	}
	
	@Override
	public String getSom()
	{
		return "\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + "\nSom que emite: " + super.getSom() +
		"\nRaça: " + getRaca();
		
	}

}
