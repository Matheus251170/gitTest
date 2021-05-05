package ex_logica;


import java.util.*;


public class exercicio4 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double a, b, c, d, r, s;
		
		System.out.print("Entre com o valor de A: ");
		a = read.nextDouble();
		
		System.out.print("Entre com o valor de B: ");
		b = read.nextDouble();
		
		System.out.print("Entre com o valor de C: ");
		c = read.nextDouble();
		
		r = Math.pow((a + b), 2);
		
		s = Math.pow((b + c), 2);
		
		d = (r + s) / 2;
		
		System.out.println("O valor de R é " + r);
		System.out.println("O valor de S é " + s);
		System.out.printf("O valor de D é %.2f", d);
		


	}

}
