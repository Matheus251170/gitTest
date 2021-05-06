package repeticao_java;

import java.util.*;

public class ex_for2 {

	public static void main(String[] args) {

		Random r = new Random();
		int par=0, impar=0, num;
		
		for(int x = 0; x <= 10; x++)
		{
			num = r.nextInt(1000);
			System.out.println(num);
			
			if(num % 2 == 0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		
		System.out.println("\nO total de números pares foi " + par);
		System.out.println("\nO total de números impares foi " + impar);

	}

}
