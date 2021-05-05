package ex_logica;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		double x1, x2, y1, y2, distancia, raizDist;
		
		System.out.print("Entre com o valor de x1: ");
		x1 = read.nextDouble();
		
		System.out.print("Entre com o valor de x2: ");
		x2 = read.nextDouble();
		
		System.out.print("Entre com o valor de y1: ");
		y1 = read.nextDouble();
		
		System.out.print("Entre com o valor de y2: ");
		y2 = read.nextDouble();
		
		
		distancia = Math.pow((x2 - x1), 2) + Math.pow((y2 + y1), 2);
		raizDist = Math.sqrt(2);
		
		
		System.out.printf("A distância entre os pontos é: %.2f", raizDist);

	}

}
