package ex_logica;

import java.util.*;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int tempoSegundos, horas, minutos, segundos;
		
		
		System.out.print("Insira o tempo do evento em segundos: ");
		tempoSegundos = ler.nextInt();
		
		horas = tempoSegundos / 3600;
		minutos = (tempoSegundos % 3600) / 60;
		segundos = (tempoSegundos % 3600) % 60;
		
		System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos!" );
	}

}
