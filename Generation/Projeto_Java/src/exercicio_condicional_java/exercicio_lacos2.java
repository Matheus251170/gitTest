package exercicio_condicional_java;

import java.util.*;

public class exercicio_lacos2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int n1, n2, n3, x;
		
		System.out.print("Entre com o primeiro valor inteiro: ");
		n1 = read.nextInt();
		
		System.out.print("Entre com o segundo valor inteiro: ");
		n2 = read.nextInt();
		
		System.out.print("Entre com o terceiro valor inteiro: ");
		n3 = read.nextInt();
		
		if(n1 > n2)
		{
			x = n1;
			n1 = n2;
			n2 = x;
		}
	    if(n1 > n3)
		{
			x = n1;
			n1 = n3;
			n3 = x;
		}

		if(n2 > n3)
		{
			x = n2;
			n2 = n3;
			n3 = x;
		}
		
		System.out.print("Os valores ordenados em ordem crescente: ");
		System.out.print(n1 + ", " + n2 + ", " + n3);

	}

}
