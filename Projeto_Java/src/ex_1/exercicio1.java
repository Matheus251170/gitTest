package ex_1;

import java.util.*;

public class exercicio1 {
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in); 
		int idade, diaNasc, mesNasc, total, mes;
		
		
		
		
		System.out.print("Digite sua idade: ");
		idade = ler.nextInt();
		
		System.out.print("Digite o mês de seu nascimento: ");
		mesNasc = ler.nextInt();
		
		System.out.print("Digite o dia do seu nascimento: ");
		diaNasc = ler.nextInt();
		
		total = (idade * 365) + (mesNasc * 30) + diaNasc;
		
		System.out.println("a sua idade em dias é: " + total);
	}

}
