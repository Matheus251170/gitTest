programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real p, m, E, r=50.00

		
		escreva("Insira o peso do tomate: ")
		leia(p)

		E = p - r
		m = E * 4

		se(p > r)
		{
			escreva("O peso excedeu o limite permitido!\nO execesso é de ", mat.arredondar((E), 2), " kg!")
			escreva("Sua multa é de R$", mat.arredondar(m, 2))
		}
		senao
		{
			m = 0.0
			E = 0.0
			
			escreva("\nO peso está dentro do estabelecido!")
			escreva("\nO excesso é de ",E,"kg!")
			escreva("\nSua multa é de R$", m)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 369; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */