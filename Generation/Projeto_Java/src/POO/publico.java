package POO;

public class publico extends telefone {
	
	
	public publico()
	{
		super("Público");
	}
	
	@Override
	public void tocar(int numToques)
	{
		for(int i = 0; i < numToques; i++)
		{
			System.out.println("\nTrim... trim...");
		}
	}
	
	@Override
	public void disca(String numero)
	{
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8')
		{
			System.out.println("\nEste telefone não liga para celular!");
		}
		else
		{
			System.out.println("\nDiscando para " + numero);
		}
	}
}
