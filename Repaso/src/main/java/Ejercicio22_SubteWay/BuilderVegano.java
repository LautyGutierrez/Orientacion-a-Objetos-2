package Ejercicio22_SubteWay;

public class BuilderVegano extends Builder{

	public BuilderVegano() {
		super();
	}

	public void agregarPan() {
		this.sanguche.agregarComponente(new Componente("Pan", "Integral", 100));
	}

	public void agregarAderezo() {
		this.sanguche.agregarComponente(new Componente("Aderezo", "Salsa criolla", 20));
	}
	
	public void agregarPrincipal() {
		this.sanguche.agregarComponente(new Componente("Principal", "Milanesa de girgolas", 500));
	}
	
	public void agregarAdicional() {
		
	}
}