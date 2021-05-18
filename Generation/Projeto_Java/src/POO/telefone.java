package POO;

public abstract class telefone {
	
	private String tipo;
	
	abstract public void disca(String numero);
	abstract public void tocar(int numToque);
	
	
	//constructor
	public telefone(String tipo)
	{
		this.tipo = tipo;
	}
	
	
	//getters and setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	

}
