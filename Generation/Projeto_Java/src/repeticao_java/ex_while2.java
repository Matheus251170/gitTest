package repeticao_java;

import java.util.*;
public class ex_while2 {

	public static void main(String[] args) {
		
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
						System.out.println("Sexo masculino!");
						break;
					
					case 1:
						System.out.println("Sexo feminino!");
						break;
						
					case 2: 
						System.out.println("Outro!");
						break;
						
					default:
						System.out.println("Opção inválida! Por favor, escolha uma das opções listadas!");
						
				}
				
				
				System.out.println("\nIndique sua personalidade: ");
				System.out.println("1. Calma \n2. Nervosa \n3. Agressiva");
				perso = r.nextInt(3);
				
				switch(perso)
				{
					case 0: 
						System.out.println("Calma!");
						numCalm++;
						break;
					
					case 1:
						System.out.println("Nervosa!");
						break;
						
					case 2: 
						System.out.println("Agressiva!");
						break;
						
					default:
						System.out.println("Opção inválida! Por favor, escolha uma das opções listadas!");
						
				}
				
				if(sexo == 1 && perso == 1)
				{
					FemNerv++;
				}
				else if(sexo == 0 && perso == 2)
				{
					MascViol++;
				}
				else if(sexo == 2 && perso == 0)
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
			
			System.out.print("\nNúmero de pessoas calmas: " + numCalm);
			System.out.print("\nNúmero de mulheres nervosas: " + FemNerv);
			System.out.print("\nNúmero de homens agressivos: " + MascViol);
			System.out.print("\nNúmero de outros calmos: " + outrosCalm);
			System.out.print("\nNúmero de pessoas nervosas com mais de 40 anos: " + MaiorNerv);
			System.out.print("\nNúmero de pessoas calmas menores de 18 anos: " + calmMenor);

	}

}
