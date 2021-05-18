package POO;

public class TesteTelefone {

	public static void main(String[] args) {


		celular celular = new celular();
		telefone_fixo fixo = new telefone_fixo();
		publico publico = new publico();
		
		telefone telefone = null;
		
		
		int n = (int)(Math.random() * 3.0);
		System.out.println("\nNúmero sorteado: " + n);
		
		switch(n)
		{
			case 0: 
				telefone = celular;
			break;
			
			case 1:
				telefone = fixo;
			break;
			
			case 2:
				telefone = publico;
			break;
			
			default:
				System.out.println("\nErro inesperado");
		}
		
		if(telefone != null)
		{
			telefone.disca("923245449");
			telefone.tocar(2);
		}

	}

}
