package POO;

public class retangulo extends Base_figura implements figuras{

	retangulo(double lado1, double lado2, String nome)
	{
		super(lado1, lado2, nome);
		nomeClasse = "Retângulo";
	}
	
	@Override
	public double getDiagonal()
	{
		return Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
	}
}
