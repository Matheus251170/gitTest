programa
{
	inclua biblioteca Util --> u
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real salario,filhos, mediaS = 0.0, mediaF = 0.0, maiorsalario = 0.0 , percentual=0.0, salarioP = 0.0
		inteiro cont, habitantes = 20

	
		
		para(cont = 1; cont <= habitantes; cont++)
		{
			escreva("\nEntre com seu salario: ")
			leia(salario)
			
			escreva("Entre com o número de filhos: ")
			leia(filhos)

			
			
				se(salario <= 100)
				{
					salarioP++
					percentual = (salarioP * 100) / 20 
				}
				se(maiorsalario < salario)
				{
					maiorsalario = salario
				}
				senao
				{
					mediaF = mediaF + filhos
					mediaS = mediaS + salario
				}
				
			limpa()
		} 
		limpa()

		mediaF = mediaF / 20
		mediaS = mediaS / 20

		escreva("\nA média de filhos dessa população é: ", mat.arredondar(mediaF, 2))
		escreva("\nA média salarial dessa população é: R$", mat.arredondar(mediaS, 2))
		escreva("\nO maior salário dessa população é: R$", mat.arredondar(maiorsalario, 2))
		escreva("\nO percentual de pessoas com salario até R$100,00 é: ", mat.arredondar(percentual, 2), "%")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 508; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */