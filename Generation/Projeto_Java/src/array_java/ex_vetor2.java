package array_java;

import java.util.*;

public class ex_vetor2 {

	public static void main(String[] args) {
		/* VETOR
			Faça um programa que receba 6 números inteiros e mostre: 
			• Os números pares digitados;  
			• A soma dos números pares digitados; 
			• Os números ímpares digitados; 
			• A quantidade de números ímpares digitados.				
		*/
		
			int num[] = new int[6];
			int soma = 0, qtd = 0, par, impar;
			Random r = new Random();
		
			
			
			for(int x = 0; x < 6; x++)
			{
				num[x] = r.nextInt(100);
				
				if(num[x] % 2 == 0)
				{
					System.out.println("\nPar: " + num[x]);
					soma = soma + num[x];	
				}
				else
				{
					System.out.println("\nImpar: " + num[x]);
					qtd++;
				}
			}
			
			System.out.println("\nA soma dos números pares inseridos foi de " + soma);
			System.out.println("\nA quantidade de números impares inseridos foi de " + qtd);

	}

}
