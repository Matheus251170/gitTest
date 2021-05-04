package ex_1;

import java.util.*;

public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		String nome;
		
		
		System.out.print("Digite seu nome: ");
		nome = read.next();
		
		System.out.print("Digite a primeira nota: ");
		nota1 = read.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = read.nextDouble();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = read.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("Seu nome é "+ nome + ". Sua média é: %.2f", media, "!");
		

	}

}
