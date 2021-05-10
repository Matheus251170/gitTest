package POO;

public class aviaoTeste {

	public static void main(String[] args) {
		/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
		
		
		aviao aviao1 = new aviao("Marcos", 20, "Brasil", "Canadá");
		aviao1.imprimir();
		
		System.out.println("\n\n----SEGUNDO PASSAGEIRO---\n\n");
		
		aviao aviao2 = new aviao("Yuri", 22, "Noruega", "Nova Zelândia");
		aviao2.imprimir();
		
		System.out.println("\n\n----TERCEIRO PASSAGEIRO---\n\n");
		
		aviao aviao3 = new aviao("Kátia", 22, "Chile", "Itália");
		aviao3.imprimir();

	}

}
