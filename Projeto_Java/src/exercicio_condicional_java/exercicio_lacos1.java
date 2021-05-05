package exercicio_condicional_java;

import java.util.*;

public class exercicio_lacos1 {

	public static void main(String[] args) {
		
		
		Scanner read = new Scanner(System.in);
		int num1, maiorNum = 0;
		
		for(int x = 1; x <= 3; x++)
		{
			System.out.print("Insira um número: ");
			num1 = read.nextInt();
			
			if(num1 > maiorNum)
			{
				maiorNum = num1;
			}
			
		}
		
		System.out.println("Entre os números digitados, o maior foi: " + maiorNum);

	}

}
