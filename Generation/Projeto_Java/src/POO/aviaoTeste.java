package POO;

public class aviaoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
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
