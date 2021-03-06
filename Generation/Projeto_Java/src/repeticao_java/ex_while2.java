package repeticao_java;

import java.util.*;

public class ex_while2 {

	public static void main(String[] args) {
		
		/*WHILE
		  
		Uma empresa desenvolveu uma pesquisa para saber as caracter?sticas psicol?gicas dos indiv?duos de uma regi?o.
		Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros),
		e as op??es (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
		Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
		
		?	o n?mero de pessoas calmas; 
		?	o n?mero de mulheres nervosas; 
		?	o n?mero de homens agressivos; 
		?	o n?mero de outros calmos;
		?	o n?mero de pessoas nervosas com mais de 40 anos; 
		?	o n?mero de pessoas calmas com menos de 18 anos.

		 */
		
			Scanner ler = new Scanner(System.in);
			Random r = new Random();
			int idade, sexo, perso, cont = 0, numCalm = 0, FemNerv = 0, MascViol = 0, outrosCalm = 0, MaiorNerv = 0, calmMenor = 0;
			
			while(cont <= 150)
			{
				
				idade = r.nextInt(100);
				System.out.print("\nInsira sua idade: " + idade);
				
				System.out.println("\nIndique seu sexo: ");
				System.out.println("1. Masculino \n2. Feminino \n3. Outro");
				sexo = r.nextInt(3);
				
				switch(sexo)
				{
					case 0: 
						System.out.println("\nSexo masculino!");
						break;
					
					case 1:
						System.out.println("\nSexo feminino!");
						break;
						
					case 2: 
						System.out.println("\nOutro!");
						break;
						
					default:
						System.out.println("\nOp??o inv?lida! Por favor, escolha uma das op??es listadas!");
						
				}
				
				
				System.out.println("\nIndique sua personalidade: ");
				System.out.println("1. Calma \n2. Nervosa \n3. Agressiva");
				perso = r.nextInt(3);
				
				switch(perso)
				{
					case 0: 
						System.out.println("\nCalma!");
						numCalm++;
						break;
					
					case 1:
						System.out.println("\nNervosa!");
						break;
						
					case 2: 
						System.out.println("\nAgressiva!");
						break;
						
					default:
						System.out.println("\nOp??o inv?lida! Por favor, escolha uma das op??es listadas!");
						
				}
				
				if(sexo == 1 && perso == 1)
				{
					FemNerv++;
				}
				if(sexo == 0 && perso == 2)
				{
					MascViol++;
				}
				if(sexo == 2 && perso == 0)
				{
					outrosCalm++;
				}
				
				if(idade > 40 && perso == 1)
				{
					MaiorNerv++;
				}
				if(idade < 18 && perso == 0)
				{
					calmMenor++;
				}
				
				
				cont++;
			}
			
			System.out.print("\nN?mero de pessoas calmas: " + numCalm);
			System.out.print("\nN?mero de mulheres nervosas: " + FemNerv);
			System.out.print("\nN?mero de homens agressivos: " + MascViol);
			System.out.print("\nN?mero de outros calmos: " + outrosCalm);
			System.out.print("\nN?mero de pessoas nervosas com mais de 40 anos: " + MaiorNerv);
			System.out.print("\nN?mero de pessoas calmas menores de 18 anos: " + calmMenor);

	}

}
