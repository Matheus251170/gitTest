programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro v1[10], v2[10], v3[10]

		para(inteiro x = 0; x < 10; x++)
		{
			v1[x] = u.sorteia(1, 50)
		}

		
		para(inteiro x = 0; x < 10; x++)
		{
			v2[x] = u.sorteia(1, 50)
		}

		
		para(inteiro x = 0; x < 10; x++)
		{
			v3[x] = v1[x] * v2[x]

			escreva("\nO resultado do indice ", x+1, " é: ", v3[x])
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {v1, 7, 10, 2}-{v2, 7, 18, 2}-{v3, 7, 26, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */