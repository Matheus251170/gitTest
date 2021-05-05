programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		inteiro valor, soma = 0, cont = 1

				
			escreva("\nEntre com um valor: ")
			leia(valor)
			
		faca
		{

			se(valor != 0 e valor >= 1)
			{
				soma = soma + cont
			}
			senao
			{
				escreva("\nPor favor, insira um número positivo maior que zero!")
			}
			cont++
		}
		enquanto(cont <= valor)

		escreva("\nSomatório dos números: ", soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 121; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */