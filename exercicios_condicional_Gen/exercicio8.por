programa
{
	inclua biblioteca Util --> u
	
	funcao inicio()
	{
		inteiro n
		
		n = u.sorteia(1, 1000)
		
		se(n <= 100)
		{
			n = 0
			
			escreva("O valor é ", n)
		}
		senao
		{
			escreva("O valor é ", n)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 165; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */