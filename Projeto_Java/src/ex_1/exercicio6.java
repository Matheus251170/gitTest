package ex_1;

import java.util.*;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double custoFabrica, custoImp, custoDist, custoTotal;
		
		System.out.print("Entre com o valor do custo de f�brica: R$");
		custoFabrica = ler.nextDouble();
		
		custoDist = custoFabrica * 0.28;
		custoImp = custoFabrica * 0.45;
		custoTotal = custoFabrica + custoImp + custoDist;
		
		System.out.printf("O custo total que voc� ter� com o ve�culo � de R$%.2f", custoTotal);

	}

}
