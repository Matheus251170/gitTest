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
			//tratamento da exce��o
			System.out.println("\nA frase est� vazia. Aplicaremos um valor default");
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nFrase nova: " + novaFrase);

	}

}
