package POO;

public class aviaoTeste {

	public static void main(String[] args) {
		/*2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.*/
		
		
		aviao aviao1 = new aviao("Marcos", 20, "Brasil", "Canad�");
		aviao1.imprimir();
		
		System.out.println("\n\n----SEGUNDO PASSAGEIRO---\n\n");
		
		aviao aviao2 = new aviao("Yuri", 22, "Noruega", "Nova Zel�ndia");
		aviao2.imprimir();
		
		System.out.println("\n\n----TERCEIRO PASSAGEIRO---\n\n");
		
		aviao aviao3 = new aviao("K�tia", 22, "Chile", "It�lia");
		aviao3.imprimir();

	}

}
