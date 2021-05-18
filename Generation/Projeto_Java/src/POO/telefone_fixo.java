package POO;

public class telefone_fixo extends telefone{
	
	
	
	public telefone_fixo()
	{
		super("Fixo");
	}
	
	
	@Override
	public void tocar(int numToque)
	{
		for(int i = 0; i < numToque; i++)
		{
			System.out.println("\nHello Moto!");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		System.out.println("\nDiscando: " + numero);
	}
}
