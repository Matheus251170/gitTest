package repeticao_java;

import java.util.*;

public class ex_doWhile1 {

	public static void main(String[] args) {
		
		/*DO...WHILE
		  
		 Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. No final, mostre a soma dos n�meros digitados.
		 
		 */
		
		Scanner read = new Scanner(System.in);
		int num, soma = 0;
				
		do
		{
			
			System.out.print("\nEntre com um n�mero inteiro: ");
			num = read.nextInt();
			
			soma = soma + num;
	
		}
		while(num != 0);
		
		System.out.print("A soma dos n�meros digitados � " + soma);

	}

}
