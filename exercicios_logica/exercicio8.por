programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro v[20]

		
		para(inteiro x = 0; x < 20; x++)
		{
			v[x] = u.sorteia(1, 50)

			escreva(v[x], " ")

		}
		
		
		escreva("\n\n")
		
		para(inteiro y = 19; y >= 0; y--)
		{
		
			escreva(v[y], " ")
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */