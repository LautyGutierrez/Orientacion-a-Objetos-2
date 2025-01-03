package Ejercicio22_SubteWay;

public class BuilderSinTACC extends Builder{

	public BuilderSinTACC() {
		super();
	}

	public void agregarPan() {
		this.sanguche.agregarComponente(new Componente("Pan", "de chipa", 150));
	}

	public void agregarAderezo() {
		this.sanguche.agregarComponente(new Componente("Aderezo", "Salsa tartara", 18));
	}
	
	public void agregarPrincipal() {
		this.sanguche.agregarComponente(new Componente("Principal", "Carne de pollo", 250));
	}
	
	public void agregarAdicional() {
		this.sanguche.agregarComponente(new Componente("Adicional", "Verduras grilladas", 200));
	}
}
