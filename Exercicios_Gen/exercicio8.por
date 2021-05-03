programa
{
	
	funcao inicio()
	{

		real custoFabrica, custoImp, custoDist, custoTotal

		 
		escreva("Entre com o valor do custo de fábrica: ")
		leia(custoFabrica)
		
		custoDist = custoFabrica * 0.28
		custoImp = custoFabrica * 0.45


		custoTotal = custoFabrica + custoImp + custoDist

		escreva("O custo total que você terá com o veículo é de R$", custoTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 267; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */