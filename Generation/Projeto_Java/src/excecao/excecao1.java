package excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class excecao1 {

	//demonstra lançamento de uma exceção quando ocorre uma divisão por zero
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException
	{
		return numerador / denominador; //possibilita a divisão por zero
	}
	
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		
		boolean continueLoop = true;
		
		
		do 
		{
			try 
			{
				//ler dois valores e calcular o consciente
				
				System.out.println("\nEntre com o numerador: ");
				int numerador = read.nextInt();
				
				System.out.println("\nEntre com o denominador: ");
				int denominador = read.nextInt();
				
				int result = quociente(numerador, denominador);
				
				System.out.printf("\nResultado: %d / %d = %d", numerador, denominador, result);
			}
			catch(InputMismatchException inputMismatchException)
			{
				System.err.printf("\nException: %s\n", inputMismatchException);
				read.nextLine();
				System.out.println("\nVocê deve entrar com um valor do tipo inteiro! Por favor, tente novamente.");
				
			}
			catch(ArithmeticException arithmeticException )
			{
				System.err.printf("\nException: %s\n", arithmeticException);
				read.nextLine();
				System.out.println("\nZero é um denominador inválido! Por favor, tente novamente.");
			}
		}
		while(continueLoop);
	}
}
