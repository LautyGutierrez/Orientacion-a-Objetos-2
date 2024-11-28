package Ejercicio4_CalculoDeSueldos;

public class Planta extends Empleado{
	private int antiguedad;
	
	public Planta(int cant) {
		super();
		this.antiguedad = cant;
	}
	
	public double basico() {
		return 50000;
	}
	
	public double adicional() {
		return super.adicional() + this.antiguedad * 2000;
	}
}