programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro n1[4][6], n2[4][6], m1[4][6], m2[4][6], l = 0, c = 0

		

		para( l = 0; l < 4; l++)
		{
			para(c = 0; c < 6; c++)
			{
				
				n1[l][c] = u.sorteia(1,100)
				n2[l][c] = u.sorteia(1,100)
			}
		}

		para(l = 0; l < 4; l++)
		
		{
			para(c = 0; c < 6; c++)
			
			{
				m1[l][c] = n1[l][c] + n2[l][c]
			}
			
		}

		para(l = 0; l < 4; l++)
		
		{
			para(c = 0; c < 6; c++)
			
			{
				m2[l][c] = n1[l][c] - n2[l][c]
			}
			
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {n1, 7, 10, 2}-{n2, 7, 20, 2}-{m1, 7, 30, 2}-{m2, 7, 40, 2};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */