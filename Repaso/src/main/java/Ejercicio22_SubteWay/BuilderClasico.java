package Ejercicio22_SubteWay;

public class BuilderClasico extends Builder{

	public BuilderClasico() {
		super();
	}
	
	public void agregarPan() {
		this.sanguche.agregarComponente(new Componente("Pan", "Brioche", 100));
	}

	public void agregarAderezo() {
		this.sanguche.agregarComponente(new Componente("Aderezo", "Mayonesa", 20));
	}
	
	public void agregarPrincipal() {
		this.sanguche.agregarComponente(new Componente("Principal", "Carne de ternera", 300));
	}
	
	public void agregarAdicional() {
		this.sanguche.agregarComponente(new Componente("Adicional", "Tomate", 80));
	}

}