package POO.Collection;

import java.util.Scanner;
import java.util.ArrayList;

public class colecoes2 {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.*/
		
		int op;
		
		Scanner leia = 	new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do
		{
			System.out.println("\n------------------------");
			System.out.println("\n1.Adicionar"
					+ "\n2.Remover"
					+ "\n3.Atualizar"
					+ "\n4.Mostrar produtos"
					+ "\n5.Encerrar");
			
			op = leia.nextInt();
			
			switch(op)
			{
				case 1:
					leia.nextLine();
					System.out.println("\nDigite o produto para adicionar: ");
					String produto = leia.nextLine();
					estoque.add(produto);
				break;
				
				case 2:
					leia.nextLine();
					System.out.println("\nDigite o produto para adicionar: ");
					String remove = leia.nextLine();
					
					if(estoque.contains(remove))
					{
						estoque.remove(remove);
					}
					else
					{
						System.out.println("\nProduto não existe!");
					}
					
				break;
				
				case 3:
					leia.nextLine();
					System.out.println("\nDigite o produto para atualizar: ");
					String verifica = leia.nextLine();
					
					System.out.println("\nDigite o nome do produto para entrar no lugar deste: ");
					String novo = leia.nextLine();
					
					if(estoque.contains(verifica))
					{
						estoque.remove(verifica);
						estoque.add(novo);
					}
					else
					{
						System.out.println("\nProduto não existe!");
					}
					
				break;
				
				case 4:
					leia.nextLine();
					System.out.println("\nProdutos em estoque: ");
					System.out.println(estoque);
					
				break;
				
				case 5:
					
					System.out.println("\nFinalizando programa");
				break;
					

				default:
					System.out.println("\nOpção inválida!");

			}
		}
		while(op != 5);
	
	
	}

}
