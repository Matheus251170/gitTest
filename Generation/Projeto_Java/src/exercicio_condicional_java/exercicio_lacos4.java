package exercicio_condicional_java;

import java.util.*;

public class exercicio_lacos4 {

	public static void main(String[] args) {


		Scanner read = new Scanner(System.in);
		int num;
		
		
		System.out.print("Entre com um número inteiro: ");
		num = read.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("\nO número é par!");
			System.out.printf("\nSua raíz quadrada é: %.2f", Math.sqrt(num));
		}
		else
		{
			System.out.println("O número é impar!");
			System.out.println("\nSeu quadrado é: " + Math.pow(num, 2));
		}

	}

}
