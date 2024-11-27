package Ejercicio13_DecodificadorDePeliculas;

import java.util.List;
import java.util.stream.Collectors;

public class Puntaje implements Strategy{
	public List<Peliculas> sugerir(List<Peliculas> grilla, List<Peliculas> reproducidas){
		return grilla.stream().filter(p -> !reproducidas.contains(p))
				.sorted((p1, p2) -> {
					int a = Double.compare(p2.getPuntaje(), p1.getPuntaje());
					if(a == 0) {
						return Integer.compare(p2.getEstreno(), p1.getEstreno());
					} else {
						return a;
					}
				}).limit(3)
				.collect(Collectors.toList());
	}
}
