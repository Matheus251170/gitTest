programa
{
	
	funcao inicio()
	{

		real base, altura, area
		
		escreva("Entre com o valor base do triângulo: ")
		leia(base)
		
		se(base <= 0)
		{
			escreva("Valor inválido! Por favor, insira valores positivos maiores do que zero! ")
		}
		
		senao
		{
			escreva("Entre com o valor da altura do triângulo: ")
			leia(altura)
			
			se(altura <= 0)
			{
				escreva("Valor inválido! Por favor, insira valores positivos maiores do que zero! ")
			}
			senao
			{
				area = base * altura / 2

				escreva("O valor da área do triângulo é ", area)
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */