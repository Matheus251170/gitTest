programa
{
	
	funcao inicio()
	{
		inteiro n


		escreva("Entre com um número inteiro: ")
		leia(n)
		
		se(n % 2 == 0)
		{
			se(n >= 0)
			{
				escreva(n, " é número par e positivo!")
			}
			senao
			{
				escreva(n, " é número par e negativo!")
			}
		}
		senao
		{
			se(n >= 0)
			{
				escreva(n, " é número impar e positivo!")
			}
			senao
			{
				escreva(n, " é número impar e negativo!")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 383; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */