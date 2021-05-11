package POO;

public class preguica extends animal {
	
	
	public preguica(String nome, int idade, String som, String raca)
	{
		super(nome, idade, som, raca);
		
	}
	
	
	public void movimento()
	{
		System.out.println("Tipo de movimento: sobe em árvores");
	}
	
	public void imprimir()
	{
		System.out.println("\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + "\nSom que emite: " + getSom() + "\nRaça: " 
		+ getRaca());
		
	}

}
