package POO;

public class quadrado extends Base_figura implements figuras {

	quadrado(double lado, String nome)
	{
		super(lado, lado, nome);
		nomeClasse = "Quadrado";
	}
	
	@Override
	public double getDiagonal()
	{
		//tem na interface
		
		return Math.sqrt(2) * lado1;
	}

}
