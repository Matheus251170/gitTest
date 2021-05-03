programa
{
	
	funcao inicio()
	{
		real i
		
		escreva("Entre com o indice de poluição: ")
		leia(i)
		
		se(i < 0.03)
		{
			escreva("Indice de poluição dentro do aceitável! Atividades devem continuar.")
		}
		senao se(i == 0.03)
		{
			escreva("ATENÇÃO: TODAS AS EMPRESAS DO PRIMEIRO GRUPO DEVEM ENCERRAR SUAS ATIVIDADES IMEDIATAMENTE!")
		}
		senao se(i == 0.04)
		{
			escreva("ATENÇÃO: TODAS AS EMPRESAS DO SEGUNDO GRUPO DEVEM ENCERRAR SUAS ATIVIDADES IMEDIATAMENTE!")
		}
		senao
		{
			escreva("ATENÇÃO: TODAS AS EMPRESAS DEVEM ENCERRAR SUAS ATIVIDADES IMEDIATAMENTE!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */