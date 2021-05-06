package repeticao_java;

import java.util.*;

public class ex_doWhile2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int num, soma = 0, cont = 0;
		float media;
		do {
			
			System.out.print("\nEntre com um valor inteiro: ");
			num = ler.nextInt();
			
			if(num != 0)
			{
				soma = soma + num;
			}
			cont++;
		}
		while(num != 0);
		
		media = soma / cont;
		
		System.out.printf("A média dos valores inseridos é %.2f", media);

	}

}
