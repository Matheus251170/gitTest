package POO;

public class celular extends telefone{

	public celular()
	{
		super("Celular");
	}
	
	@Override
	
	public void tocar(int codToque)
	{
		switch(codToque)
		{
			case 1:
				System.out.println("pirim pirim pirim pirim algu�m ligou pra mim");
				break;
				
			case 2: 
				System.out.println("Sou eu bola de fogo, o calor t� de matar...");
				break;
				
			default:
				System.out.println("\nHello Moto");
		}	
	}
	
	@Override
	public void disca(String numero)
	{
		System.out.println("\nO n�mero: " +  numero + " � um celular.");
	}
}
