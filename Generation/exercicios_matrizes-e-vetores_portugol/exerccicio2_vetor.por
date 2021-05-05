programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro dado[10], cont = 0, soma = 0, maiorP = 6
		real media

		para(inteiro x = 0; x <= 9; x++)
		{

			dado[x] = u.sorteia(1, 6)
			escreva("\n",x+1, "º valor: ", dado[x])

			soma = soma + dado[x]

			
				
			se(dado[x] == maiorP)
				{
					cont++
				}
		}

		media = soma / 10

		escreva("\n\nA média é: ", media)
		escreva("\nA a soma é: ", soma)
		escreva("\nA quantidade de vezes que o maior número apareceu foi: ", cont)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 117; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */