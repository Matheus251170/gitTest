package POO;

public class produtoEletronicoTeste {

	public static void main(String[] args) {
		/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
	referentes esta classe, em seguida crie um objeto produto eletr�nico,
	defina as instancias deste objeto e apresente as informa��es deste objeto
	no console.*/

		
		produtoEletronico produto1 = new produtoEletronico("Notebook", 2155.98, "Samsumg", "Luis");
		produto1.imprimir();
		
		
		System.out.println("\n\n---PROXIMA COMPRA---\n\n");
		
		
		produtoEletronico produto2 = new produtoEletronico("Lava lou�as", 1570.39, "Tramontina", "Maria do Carmo");
		produto2.imprimir();
		
		
		System.out.println("\n\n---PROXIMA COMPRA---\n\n");
		
		
		produtoEletronico produto3 = new produtoEletronico("Celular", 1499.99, "Motorola", "Beatriz");
		produto3.imprimir();
	}
}
