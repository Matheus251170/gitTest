programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real c, n, s, E, salarioTotal


		escreva("Entre com o código do funcionário: ")
		leia(c)

		escreva("Entre com o número de horas trabalhadas: ")
		leia(n)

		s = n * 10
		E = (n - 50) * 20
		salarioTotal = s + E
		 
		se(n > 50)
		{
			escreva("Seu salário é de R$", mat.arredondar(salarioTotal, 2))
			escreva("\nO valor excedente é de R$", mat.arredondar(E,2))				
		}
		senao
		{
			E = 0.0

			escreva("Seu salário é de R$", mat.arredondar(s, 2))
			escreva("\nO valor excedente é de R$", mat.arredondar(E,2))	
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 85; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */