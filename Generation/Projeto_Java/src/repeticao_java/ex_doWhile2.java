package repeticao_java;

import java.util.*;

public class ex_doWhile2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		float media, num, soma = 0, cont = 0;;
		do {
			
			System.out.print("\nEntre com um valor inteiro: ");
			num = ler.nextInt();
			
			
			soma = soma + num;
			
			cont++;
		}
		while(num != 0);
		
		media = soma / cont;
		
		System.out.printf("A m�dia dos valores inseridos � %.2f", media);

	}

}
