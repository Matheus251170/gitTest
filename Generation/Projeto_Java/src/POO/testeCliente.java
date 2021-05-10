package POO;

public class testeCliente {

	public static void main(String[] args) {
		
		/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


		cliente cliente1 = new cliente("Matheus", "Livro: Clean Code", 19);
		cliente1.imprimir();
		
		
		System.out.println("\n\n----PROXIMO CLIENTE----\n\n");
		
		
		
		cliente cliente2 = new cliente("Isabela", "Aspirador de pó", 23);
		cliente2.imprimir();
		
		
		System.out.println("\n\n----PROXIMO CLIENTE----\n\n");
		
		
		
		cliente cliente3 = new cliente("Sherlock Casas", "Charuto", 27);
		cliente3.imprimir();


	}

}
