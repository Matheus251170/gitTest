package POO;

public class cachorro extends animal{
	
	
	public cachorro(String nome, int idade, String som, String raca)
	{
		super(nome, idade, som, raca);
		
	}
	
	
	public void movimento()
	{
		System.out.println("Tipo de movimento: Correr");
	}
	
	public void imprimir()
	{
		System.out.println("\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + "\nSom que emite: " + getSom() + "\nRaça: " 
		+ getRaca());
		
	}

}
