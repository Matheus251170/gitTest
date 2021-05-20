package excecao;

public class exception {

	public static void main(String[] args) {

		String frase = null;
		String novaFrase = null;
		
		try
		{
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e)
		{
			//tratamento da exceção
			System.out.println("\nA frase está vazia. Aplicaremos um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nFrase nova: " + novaFrase);

	}

}
