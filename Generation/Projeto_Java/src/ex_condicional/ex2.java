package ex_condicional;

import java.util.*;

public class ex2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double c, n, s, e , salarioTotal;
		
		
		System.out.printf("Entre com o código do funcionário: ");
		c = ler.nextDouble();
		
		System.out.printf("Entre com o número de horas trabalhadas: ");
		n = ler.nextDouble();
		
		
		s = n * 10;
		e = (n - 50) * 20;
		salarioTotal = s + e;
		
		if(n > 50)
		{
			System.out.printf("Seu salário é de R$%.2f", salarioTotal);
			System.out.printf("\nO valor excedente é de R$%.2f", e);
		}
		else
		{
			e = 0;
			
			System.out.printf("Seu salário é de R$%.2f", s);
			System.out.printf("\nO valor excendete é de R$%.2f", e);
		}

	}

}
