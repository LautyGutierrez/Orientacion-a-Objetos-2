package Ejercicio13_DecodificadorDePeliculas;

import java.util.List;

public interface Strategy {
	public List<Peliculas> sugerir(List<Peliculas> grilla, List<Peliculas> reproducidas);
}