package ex_logica;

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int idadeDias, anos, meses, dias;
		
		
		System.out.print("Entre com sua idade em dias: ");
		idadeDias = read.nextInt();
		
		anos = idadeDias / 365;
		meses = (idadeDias % 365) / 30;
		dias = (idadeDias % 365) % 30;
		
		System.out.println("Sua idade é de " + anos + " anos!");
		System.out.println("Você nasceu no mês " + meses + "!");
		System.out.println("Você nasceu no dia " + dias + "!");

	}

}