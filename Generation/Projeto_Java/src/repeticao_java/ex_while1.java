package repeticao_java;

import java.util.*;

public class ex_while1 {

	public static void main(String[] args) {
		
		/*WHILE
		 
		 Solicitar a idade de v�rias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos.
		  O programa termina quando idade for =-99.
		 */
		
		Scanner read = new Scanner(System.in);
		int idade, totalMaior=0, totalMenor=0;
		
		System.out.print("Insira sua idade: ");
		idade = read.nextInt();
		
		while(idade != -99)
		{
			if(idade < 21)
			{
				totalMenor++;
			}
			if(idade > 50)
			{
				totalMaior++;
			}
			
			System.out.print("\nInsira sua idade: ");
			idade = read.nextInt();
		}
		
		System.out.println("\nO n�mero de pessoas com idade menor que 21 anos � de: " + totalMenor);
		System.out.println("\nO n�mero de pessoas com idade maior que 50 anos � de: " + totalMaior);
	}

}
