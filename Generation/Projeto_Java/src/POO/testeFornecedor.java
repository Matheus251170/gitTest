package POO;

public class testeFornecedor {

	public static void main(String[] args) {
		
		fornecedor Felipe = new fornecedor("Felipe", "Rua Pascoal, 22", "12234567899", 25, 966565656, 15000, 1500);
		Felipe.imprimir();
		Felipe.validarCPf();
		Felipe.obterSaldo();

	}

}
