package exercicio_condicional_java;

import java.util.*;

public class exercicio_lacos3 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int idade;
		
		
		System.out.print("Entre com sua idade: ");
		idade = read.nextInt();
		
		if(idade < 10)
		{
			System.out.println("Você não tem idade suficiente para participar de alguma categoria!");
		}
		else if(idade >= 10 && idade <= 14)
		{
			System.out.println("Você está na categoria Infantil!");
		}
		else if(idade > 14 && idade <= 17)
		{
			System.out.println("Você está na categoria Juvenil!");
		}
		else
		{
			System.out.println("Você está na categoria Adulto!");
		}

	}

}
