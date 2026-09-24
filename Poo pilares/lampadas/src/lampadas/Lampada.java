package lampadas;

public class Lampada {
	private String marca;
	private String tipoBase;
	private int preco;
	private boolean Ligada;
	
	
	
	
	public Lampada() {
		super();
	}

	public void Lampada() {
		
		this.marca = marca;
		this.tipoBase = tipoBase;
		this.preco = preco;
		this.Ligada  = Ligada;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
		
	public String getTipoBase() {
		return tipoBase;
	}
	public void setTipoBase(String tipoBase) {
		this.tipoBase = tipoBase;
	}
	
	public int getPotencia() {
		return preco;
	}
	
	
	public void ligada() {
		if (Ligada = true) {
			System.out.println("Lampada ligada");
		}
		else {
			System.out.println("Lampada desligada");
		}
	}
	
	public void exibirDados() {
		System.out.printf("marca: %s%n" + marca);
		System.out.printf("tipo de base: %s%n" + tipoBase);
		System.out.printf("preco: %d%n" + preco);
		System.out.print("estado: %s%n" + Ligada);
	}
	
}
