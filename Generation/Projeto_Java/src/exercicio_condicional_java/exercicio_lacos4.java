package exercicio_condicional_java;

import java.util.*;

public class exercicio_lacos4 {

	public static void main(String[] args) {


		Scanner read = new Scanner(System.in);
		int num;
		
		
		System.out.print("Entre com um n�mero inteiro: ");
		num = read.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("\nO n�mero � par!");
			System.out.printf("\nSua ra�z quadrada �: %.2f", Math.sqrt(num));
		}
		else
		{
			System.out.println("O n�mero � impar!");
			System.out.println("\nSeu quadrado �: " + Math.pow(num, 2));
		}

	}

}
