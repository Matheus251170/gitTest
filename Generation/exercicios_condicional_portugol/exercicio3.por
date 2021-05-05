programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4
		
		escreva("Insira o primeiro número inteiro: ")
		leia(n1)
		
		escreva("Insira o segundo número inteiro: ")
		leia(n2)
		
		escreva("Insira o terceiro número inteiro: ")
		leia(n3)
		
		escreva("Insira o quarto número inteiro: ")
		leia(n4)

		se(n3 >= 1000)
		{
			escreva("O quadrado do terceiro é: ", mat.potencia(n3, 2.0))
		}
		senao
		{
			escreva("Os valores são: ", mat.potencia(n1, 2.0),", ", mat.potencia(n2, 2.0),", ", mat.potencia(n3, 2.0),", ", mat.potencia(n4, 2.0))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 373; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */