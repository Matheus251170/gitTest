package repeticao_java;

import java.util.*;

public class ex_while1 {

	public static void main(String[] args) {
		
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
		
		System.out.println("\nO número de pessoas com idade menor que 21 anos é de: " + totalMenor);
		System.out.println("\nO número de pessoas com idade maior que 50 anos é de: " + totalMaior);
	}

}
