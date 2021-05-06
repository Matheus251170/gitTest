package repeticao_java;

import java.util.*;

public class ex_doWhile1 {

	public static void main(String[] args) {
		
		/*DO...WHILE
		  
		 Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.
		 
		 */
		
		Scanner read = new Scanner(System.in);
		int num, soma = 0;
				
		do
		{
			
			System.out.print("\nEntre com um número inteiro: ");
			num = read.nextInt();
			
			soma = soma + num;
	
		}
		while(num != 0);
		
		System.out.print("A soma dos números digitados é " + soma);

	}

}
