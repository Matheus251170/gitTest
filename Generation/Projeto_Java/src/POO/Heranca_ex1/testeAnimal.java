package POO;

public class testeAnimal {
	
	public static void main(String[] args) {
		
		cachorro cao = new cachorro("Bob", 6, "Latido", "Buldog");
		cao.imprimir();
		cao.movimento();
		
		cavalo cavalo = new cavalo("Ponyta", 13, "Relinchar", "Percheron");
		cavalo.imprimir();
		cavalo.movimento();
		
		preguica preguica = new preguica("Roberto", 8, "", "Pregiça-Bentinho");
		preguica.imprimir();
		preguica.movimento();
	}

}
