package repeticao_java;

import java.util.*;

public class ex_doWhile2 {

	public static void main(String[] args) {
		
		/* DO...WHILE
		 
		 Escrever um programa que receba vários números inteiros no teclado.
		 E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
		 
		 */
		
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
		
		System.out.printf("A média dos valores inseridos é %.2f", media);

	}

}
