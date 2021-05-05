package ex_condicional;

import java.util.*;
public class ex1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double p, m, e, r = 50.00;
		
		System.out.print("Insira o peso do tomate: ");
		p = ler.nextDouble();
		
		e = p - r;
		m = e * 4;
		
		
		if(p > r)
		{
			System.out.printf("O peso excedeu o limite permitido!\nO excesso é de %.2f", e);
			System.out.printf("\nSua multa é de R$%.2f", m);
		}
		else
		{
			m = 0.0;
			e = 0.0;
			
			System.out.printf("\nO peso está dentro do estabelecido!");
			System.out.printf("\nO excesso é de %.2fkg!", e);
			System.out.printf("\nSua multa é de R$%.2f",  m);
		}
	}
	

}
