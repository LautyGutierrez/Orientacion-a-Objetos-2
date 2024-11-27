package Ejercicio10_Encriptador;

public class Encriptador {
	private Algoritmo algoritmo;
	
	public Encriptador(Algoritmo a) {
		this.algoritmo = a;
	}
	
	public void encriptar(String mensaje) {
		this.algoritmo.encriptar(mensaje);
	}
	
	public void setAlgoritmo(Algoritmo a) {
		this.algoritmo = a;
	}
}
