package POO.Heranca_ex1;

public class preguica extends animal {
	
	
	public preguica(String nome, int idade, String som, String raca)
	{
		super(nome, idade, som, raca);
		
	}
	
	
	public void movimento()
	{
		System.out.println("Tipo de movimento: sobe em árvores");
	}
	
	@Override
	public String getSom()
	{
		return "\nNome do animal: " + getNome() + "\nIdade: " + getIdade() + "\nSom que emite: " + super.getSom() +
		"\nRaça: " + getRaca();
		
	}

}
