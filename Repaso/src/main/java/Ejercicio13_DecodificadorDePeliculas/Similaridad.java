package Ejercicio13_DecodificadorDePeliculas;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Similaridad {
	public List<Peliculas> sugerir(List<Peliculas> grilla, List<Peliculas> reproducidas){
		Set<Peliculas> peliculas = reproducidas.stream().
				flatMap(p -> p.getSimilares().stream())
				.collect(Collectors.toSet());
		return peliculas.stream().filter(p -> !reproducidas.contains(p))
				.sorted((p1, p2) -> Integer.compare(p2.getEstreno(), p1.getEstreno()))
				.limit(3).collect(Collectors.toList());
	}
}
