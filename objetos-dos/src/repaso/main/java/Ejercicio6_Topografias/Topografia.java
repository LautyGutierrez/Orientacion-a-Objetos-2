package Ejercicio6_Topografias;

public abstract class Topografia {
	public Topografia() {
		
	}
	
	public abstract double proporcionDeAgua();
	
	public double proporcionDeTierra() {
		return 1 - this.proporcionDeAgua();
	}
	
	public abstract boolean equals(Topografia t);
	public abstract boolean equalsSimple(Topografia t);
	public abstract boolean equalsMixta(Mixta m);
}