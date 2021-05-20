package Optional;

import java.util.Optional;

public class optional {

	public static void main(String[] args) {
		
		Optional<String> linguagem = Optional.of("Bruno");
		String respostaPreenchida = "SIM";
		String respostaNula = null;
		
		System.out.println("\nOptional n�o vazio: " + linguagem);
		System.out.println("\nOptional n�o vazio: Obtem valor - " + linguagem.get());
		System.out.println("\nOptional vazio: " + Optional.empty());
		System.out.println("\nChamada de m�todo ofNullable() em Optional n�o vazio: " + Optional.ofNullable(respostaPreenchida));
		System.out.println("\nChamada do m�todo ofNullable() em Optional vazio: " + Optional.ofNullable(respostaNula));
	}

}
