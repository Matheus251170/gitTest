programa
{
	
	funcao inicio()
	{
		real notas[5],maiorN = 0.0
		inteiro x

		para(x = 0; x < 5; x++)
		{
			escreva("\nDigite sua nota: ")
			leia(notas[x])

			se(maiorN < notas[x])
			{
				maiorN = notas[x]	
			}
		}

		para(x = 0; x < 5; x++)
		{
			escreva("\nA ",x+1,"º nota digtada foi: ", notas[x])
		}

		escreva("\n\nA maior nota foi: ", maiorN)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 278; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */