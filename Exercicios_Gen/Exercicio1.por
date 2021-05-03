programa
{
	
	funcao inicio()
	{
		inteiro idade, diaNasc, mesNasc, total, ano = 365, mes = 30
		
		escreva("Digite sua idade: ")
		leia(idade)

		escreva("Digite o mês de seu nascimento: ")
		leia(mesNasc)
		
		escreva("Digite o dia do seu nascimento: ")
		leia(diaNasc)

		total = (idade * ano) + (mesNasc * mes) + diaNasc

		escreva("A sua idade em dias é de ", total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */