package Ejercicio13_DecodificadorDePeliculas;

import java.util.List;
import java.util.ArrayList;

public class Peliculas {
	private String titulo;
	private int estreno;
	private List<Peliculas> similares;
	private double puntaje;
	
	public Peliculas(String titulo, int estreno, double puntaje) {
		this.titulo = titulo;
		this.estreno = estreno;
		this.similares = new ArrayList<>();
		this.puntaje = puntaje;
	}
	
	public int getEstreno() {
		return this.estreno;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public List<Peliculas> getSimilares(){
		return this.similares;
	}
}