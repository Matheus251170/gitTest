programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{

		inteiro num = 0, soma = 0, cont = 0
		real media

		enquanto(cont < u.sorteia(1,10))
		{
			escreva("Entre com um valor positivo: ")
			leia(num)

			se(num >= 0)
			{
				cont++
				soma = soma + num
			}
			senao
			{
				escreva("O valor inserido é inválido! Por favor, insira um valor positivo!")
			}
		}

		media = soma / cont

		escreva("\nA soma total é: ", soma)
		escreva("\nA média é: ", media)
		escreva("\nO total de valores lidos é: ", cont)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 95; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */