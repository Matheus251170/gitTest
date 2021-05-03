programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro num[10], n, x, v = 0,t=0

		para(x = 0; x < 10; x++)
		{

			num[x] = u.sorteia(1, 10)

			escreva("\n", num[x])

		}

		escreva("\nDigite um número: ")
		leia(n)

		para(x = 0; x < 10; x++)
		{
			se(n == num[x])
			{
				t = x
				v = 1
			}

		}

			se(v == 1)
			{
				escreva("\nNúmero faz parte do array e está na posição ", t)
			}
			senao
			{
				escreva("\nNúmero não faz parte do array!")
			}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 409; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {num, 7, 10, 3}-{n, 7, 19, 1}-{x, 7, 22, 1}-{t, 7, 31, 1}-{v, 7, 25, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */