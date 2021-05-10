package array_java;

import java.util.*;

public class ex_matriz2 {

	public static void main(String[] args) {
		/* MATRIZ
		
		 	Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
			Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
		*/
		
		
		double m1[][] = new double[2][2];
		double m2[][] = new double[2][2];
		double m3[][] = new double[2][2];
		
		Scanner read = new Scanner(System.in);
		double num, cons;
		int resp;
		
		for(int l = 0; l < 2; l++)
		{
			for(int c = 0; c < 2; c++)
			{
				System.out.print("\nInsira um valor para a primeira matriz: ");
				m1[l][c] = read.nextDouble();
				
				System.out.print("\nInsira um valor para a segunda matriz: ");
				m2[l][c] = read.nextDouble();

			}
		}
		
		System.out.println("\nO que você deseja?");
		System.out.println("\n1. Somar\n2. Subtrair\n3. Adicionar constante\n4. Imprimir as matrizes");
		resp = read.nextInt();
		
		switch(resp)
		{
			case 1:
				
				for(int l = 0; l < 2; l++)
				{
					for(int c = 0; c < 2; c++)
					{
						m3[l][c] = m1[l][c] + m2[l][c];
						
						System.out.print("\nResultado: " + m3[l][c]);						

					}
				}
				
				break;
				
				
			case 2:
				
				for(int l = 0; l < 2; l++)
				{
					for(int c = 0; c < 2; c++)
					{
						m3[l][c] = m2[l][c] - m1[l][c];
						
						System.out.print("\nResultado: " + m3[l][c]);

					}
				}
				
				break;
				
				
			case 3:
				
				System.out.print("\nDigite a constante: ");
				cons = read.nextDouble();
				
				System.out.print("\nVocê deseja somar com os valores de qual matriz?");
				System.out.println("\n1. Primeira matriz\n2. Segunda matriz");
				num = read.nextDouble();
				
				for(int l = 0; l < 2; l++)
				{
					for(int c = 0; c < 2; c++)
					{
						if(num == 1)
						{
							m1[l][c] = m1[l][c] + cons;
							
							System.out.println("\n" + m1[l][c]);
						}
						else if(num == 2)
						{
							m2[l][c] = m1[l][c] + cons;
							
							System.out.println("\n" + m2[l][c]);
						}
						else
						{
							System.out.println("\nValor inválido!");
						}
					}
				}
				
				break;
				
			case 4:
				
				for(int l = 0; l < 2; l++)
				{
					for(int c = 0; c < 2; c++)
					{
						System.out.print("\nPrimeira matriz: " + m1[l][c]);						
					}
				}
				
				for(int l = 0; l < 2; l++)
				{
					for(int c = 0; c < 2; c++)
					{
						System.out.print("\nSegunda matriz: " + m2[l][c]);						
					}
				}
				
				break;
				
				default:
					
					System.out.println("Por favor, entre com uma opção válida!");
		
		}

	}

}
