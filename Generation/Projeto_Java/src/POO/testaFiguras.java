package POO;

public class testaFiguras {

	public static void main(String[] args) {


		quadrado fig1 = new quadrado(10, "Quadrado");
		retangulo fig2 = new retangulo(3, 4, "Retângulo");
		
		
		System.out.println(fig1.getNome() + ": " + fig1.getDiagonal());
		System.out.println(fig2.getNome() + ": " + fig2.getDiagonal());
	}

}
