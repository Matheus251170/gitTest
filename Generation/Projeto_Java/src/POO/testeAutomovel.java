package POO;

public class testeAutomovel {

	public static void main(String[] args) {
		// intanciando um objeto da classe automovel
		
		automovel auto1 = new automovel("Matheus", "Ferrari", "48B7546", 2021);
		
		//troca de mensagens (chamada ao metodo imprimirInfo)
		
		auto1.imprimirInfo();
		
		System.out.println("\n***TRANSFERÊNCIA DE PROPRIETÁRIO***");
		
		
		auto1.setNomeProprietarie("Tokunbo");
		auto1.imprimirInfo();
		
		
		automovel auto2 = new automovel("Amanda", "Defender", "UDP4711", 2018);
		auto2.imprimirInfo();
		
		System.out.println("\n***MUDANÇA DE PLACA***");
		auto2.setPlaca("KRP2012");
		
		auto2.imprimirInfo();
		
		

	}

}
