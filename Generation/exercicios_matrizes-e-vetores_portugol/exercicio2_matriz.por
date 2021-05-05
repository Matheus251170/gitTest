programa
{
	
	funcao inicio()
	{
		inteiro valor[3][3], soma = 0, somaD = 0

		para(inteiro l = 0; l < 3; l++)
		{
				
			para(inteiro c = 0; c < 3; c++)
			{
				escreva("Insira um número: ")
				leia(valor[l][c])

				soma = soma + valor[l][c]

				se(l == c)
				{
					somaD = somaD + valor[l][c]
				}
			}

		}

		escreva("\n\nA soma total dos valores é: ", soma)
		escreva("\nA soma dos valores da diagonal é: ", somaD)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 65; 
 * @PONTOS-DE-PARADA = 16, 20, 6, 26, 27, 13, 14;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */