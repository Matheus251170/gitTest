programa
{
	inclua biblioteca Matematica
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro v[80], p = 0, menor = 80
		
		para(inteiro x = 0; x < 80; x++)
		{
			v[x] = u.sorteia(1, 100)

			se(menor > v[x])
			{
				p = x
				menor = v[x]
			}
		}

		escreva("O menor valor é ", menor, " e sua posição no array é: ", p)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v, 8, 10, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */