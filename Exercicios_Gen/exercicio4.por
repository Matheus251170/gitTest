programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real a, b, c, d, r, s

		
		escreva("Entre com o valor de A: ")
		leia(a)
		
		escreva("Entre com o valor de B: ")
		leia(b)

		escreva("Entre com o valor de C: ")
		leia(c)

		r = mat.potencia((a + b), 2)

		s = mat.potencia((b + c), 2)

		d = (r + s) / 2

		escreva("O valor de R é ", r)
		escreva("\nO valor de S é ", s)
		escreva("\nO valor de D é ", mat.arredondar(d, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 455; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */