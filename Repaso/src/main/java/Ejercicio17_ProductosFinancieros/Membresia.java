package Ejercicio17_ProductosFinancieros;

public abstract class Membresia {
	protected double tasa;
	protected int plazo;
	protected int parking;
	
	public Membresia(double tasa, int plazo, int parking) {
		this.tasa = tasa;
		this.plazo = plazo;
		this.parking = parking;
	}
	
	public double getTasa() {
		return this.tasa;
	}
	
	public int getPlazo() {
		return this.plazo;
	}
	
	public int getParking() {
		return this.parking;
	}
	
	public ProductoCombinado crearProducto1() {
		return new CreadorProducto1().crear(this);
	}
	
	public ProductoCombinado crearProducto2() {
		return new CreadorProducto2().crear(this);
	}
	
	public abstract ProductoCombinado crearProducto3();
	public abstract ProductoCombinado crearProducto4();
}
