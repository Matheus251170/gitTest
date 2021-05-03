programa
{
	inclua biblioteca Matematica --> mat
	
	
	funcao inicio()
	{
		
		real nota1, nota2, nota3, media
		cadeia nome
		
		
		
		escreva("Digite o seu nome: ") 
		leia(nome) //lê o nome dada pelo usuário e armazena na variável 

		escreva("Entre com a primeira nota: ")
		leia(nota1)

		escreva("Entre com a segunda nota: ")
		leia(nota2)

		escreva("Entre com a terceira nota: ")
		leia(nota3)

		media = (nota1 + nota2 + nota3) / 3


		escreva("\nSeu nome é ", nome, ". A média de suas notas é: ", mat.arredondar(media, 2)) //mostra a nota do usuário utilizando apenas duas casas decimais

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */