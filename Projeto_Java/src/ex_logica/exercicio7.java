package ex_logica;

import java.util.*;

public class exercicio7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.print("Digite o valor de A: ");
		a = ler.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = ler.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = ler.nextDouble();
		
		System.out.print("Digite o valor de D: ");
		d = ler.nextDouble();
		
		System.out.print("Digite o valor de E: ");
		e = ler.nextDouble();
		
		System.out.print("Digite o valor de F: ");
		f = ler.nextDouble();
		
		
		x = (c * e - b * f) / (a * e - b * d);
		y = (a * d - c * d) / (a * e - b * d);
		
		System.out.println("Os valores de x e y, respectivamente, são:" + x + " e " + y);
	}

}
