package array_java;

import java.util.*;

public class ex_matriz1 {

	public static void main(String[] args) {
		// MATRIZ
		
		//Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui
		
		
		int num[][] = new int[3][3];
		int soma = 0, qtd = 0;
		Random r = new Random();
	
		
		for(int l = 0; l < 3; l++)
		{
			for(int c = 0; c < 3; c++)
			{

				num[l][l] = r.nextInt(20);
				
				System.out.println(num[l][l]);
				
				soma = soma + num[l][l];
				
				if(num[l][l] > 10)
				{
					qtd++;
				}
				
			}
		}
		
		System.out.println("\nExistem " + qtd + " maiores que dez nesse array!");
		System.out.println("\nA soma dos valores do array é " + soma);

		
		
		
	}

}
