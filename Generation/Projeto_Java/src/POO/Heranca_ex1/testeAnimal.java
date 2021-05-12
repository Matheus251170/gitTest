package POO.Heranca_ex1;

public class testeAnimal {
	
	public static void main(String[] args) {
		
		cachorro cao = new cachorro("Bob", 6, "Latido","Buldog");
		
		cavalo cavalo = new cavalo("Ponyta", 13, "Relinchar", "Percheron");
		
		preguica preguica = new preguica("Roberto", 8, "Grunhido", "Pregiça-Bentinho");
		
		animal[] animais = new animal[3];
		animais[0] = cao;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for(animal anim:animais)
		{
			System.out.println(anim.getSom());
		}
	}

}
