package Ejercicio17_ProductosFinancieros;

import java.util.Arrays;

public class CreadorProducto2 extends Factory{
	public ProductoCombinado crear(Membresia m) {
		return new ProductoCombinado(Arrays.asList(new CompraBonoBajoRiesgo(m.getParking()), new CompraDolares(), new PlazoFijo(m.getPlazo(), m.getTasa()), new CompraPesos()));
	}
}