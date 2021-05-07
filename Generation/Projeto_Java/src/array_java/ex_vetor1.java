package array_java;

public class ex_vetor1 {

	public static void main(String[] args) {
		/* VETOR
		  
		   Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
			(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
			(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
			(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
			(d) Mostre na tela cada valor do vetor A, um em cada linha.
			*/
		
		
			int [] A = {1, 0, 5, -2, -5, 7 };
			
			int soma;
			
			
			soma = A[0] + A[1] + A[5];
			
			System.out.println("A soma dos valores nas posições 0, 1 e 5 do vetor é de: " + soma);
			
			A[4] = 100;
			
			for(int x = 0; x < 6; x++)
			{
				System.out.println("\n" + (x+1) + "º posição: " + A[x]);
			}
			

	}

}
