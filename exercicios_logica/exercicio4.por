programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro n[20], soma = 0

		para(inteiro x = 0; x < 20; x++)
		{
			n[x] = u.sorteia(1,100)

			escreva(n[x] , " + ")

			soma = soma + n[x]
		}

		escreva("0 = ")
		escreva(soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 225; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */